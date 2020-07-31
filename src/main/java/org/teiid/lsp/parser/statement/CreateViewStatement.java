/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.teiid.lsp.parser.statement;

import java.util.List;

import org.eclipse.lsp4j.DiagnosticSeverity;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.teiid.lsp.Messages;
import org.teiid.lsp.codeactions.QuickFixFactory;
import org.teiid.lsp.parser.DdlAnalyzerConstants;
import org.teiid.lsp.parser.DdlAnalyzerException;
import org.teiid.lsp.parser.DdlTokenAnalyzer;
import org.teiid.lsp.parser.SQLParserConstants;
import org.teiid.lsp.parser.Token;

@SuppressWarnings({"PMD.GodClass"})
public class CreateViewStatement extends AbstractStatementObject {

    private Token viewNameToken;
    private TableBody tableBody;
    private WithClause withClause;
    private QueryExpression queryExpression;
    private final int numTokens;

    public CreateViewStatement(DdlTokenAnalyzer analyzer) {
        super(analyzer);
        this.numTokens = this.analyzer.getTokens().size();

        parseAndValidate();
    }

    public String getStatement() {
        return this.analyzer.getStatement();
    }

    public String getViewName() {
        return viewNameToken.image;
    }

    public Token getViewNameToken() {
        return viewNameToken;
    }

    public TableBody getTableBody() {
        return tableBody;
    }

    public void setTableBody(TableBody tableBody) {
        this.tableBody = tableBody;
    }

    public WithClause getWithClause() {
        return withClause;
    }

    public QueryExpression getQueryExpression() {
        return queryExpression;
    }

    public void setQueryExpression(QueryExpression queryExpression) {
        this.queryExpression = queryExpression;
    }

//    @SuppressWarnings({"PMD.NPathComplexity", "PMD.ExcessiveMethodLength"}) // TODO refactor
    @Override
    protected final void parseAndValidate() {

        // Check statement
        if(!prefixedParsedOk()) {
            return;
        }

        // Check brackets match
        if( !isOk(this.analyzer.checkAllParens()) ) {
            this.analyzer.addException(
                    getToken(3), getToken(numTokens-1), Messages.Error.ALL_PARENS_DO_NOT_MATCH);
            this.analyzer.getReport().setParensMatch(false);
        }

        if( !isOk(this.analyzer.checkAllBrackets(SQLParserConstants.LBRACE, SQLParserConstants.RBRACE)) ) {
            this.analyzer.addException(new DdlAnalyzerException(Messages.getString(Messages.Error.ALL_BRACES_DO_NOT_MATCH)));
            this.analyzer.getReport().setBracesMatch(false);
        }

        tableBody = new TableBody(analyzer, this);

        // Check Table Body
        // If token[4] == '(' then search for
        if( numTokens < 4 ) {
            Token firstToken = getToken(0);
            Token lastToken = getToken(2);
            this.analyzer.addException(
                    firstToken,
                    lastToken,
                    Messages.Error.INCOMPLETE_CREATE_VIEW_STATEMENT);
        }

        if( numTokens > 3) {
            if( getTokenValue(3).equals("(") && this.analyzer.getReport().doParensMatch() ) {
                parseTableBody();
                if( !isLastIndex()) {
                    withClause = new WithClause(analyzer);
                    withClause.parseAndValidate();
                    if( withClause.getLastTknIndex() == 0 ) {
                        withClause = null;
                    }
                    if( !isLastIndex()) {
                        queryExpression = new QueryExpression(analyzer, this);
                        queryExpression.parseAndValidate();
                    }
                }
            } else {
                // Table Body is NOT required so check for token[3] == AS
                if( getToken(3).kind == SQLParserConstants.AS) {
                    incrementIndex();
                    withClause = new WithClause(analyzer);
                    withClause.parseAndValidate();
                    if( withClause.getLastTknIndex() == 0 ) {
                        withClause = null;
                    }
                    queryExpression = new QueryExpression(analyzer, this);
                    queryExpression.parseAndValidate();
                } else {
                    Token firstToken = getToken(3);
                    Token lastToken = getToken(numTokens-1);
                    this.analyzer.addException(
                            firstToken,
                            lastToken,
                            Messages.Error.INCOMPLETE_CREATE_VIEW_STATEMENT);
                }
            }
        }
    }

    private boolean prefixedParsedOk() {

        boolean prefixOK = true;
        // Check view name exists
        switch(numTokens) {
        case 0:
            this.analyzer.addException( new DdlAnalyzerException(
                    DiagnosticSeverity.Error,
                    Messages.getString(Messages.Error.EMPTY_STATEMENT),
                    new Range(new Position(0,0), new Position(0,0))));
            prefixOK = false;
            break;
        case 1:
            setFirstTknIndex(0);
            setLastTknIndex(0);
            if( !"CREATE".equalsIgnoreCase(getToken(0).image) ) {
                this.analyzer.addException(
                        getToken(0),
                        getToken(0),
                        Messages.Error.STATEMENT_MUST_START_WITH_CREATE_VIEW);
            }
            this.analyzer.addException(
                    getToken(0),
                    getToken(0),
                    Messages.Error.INCOMPLETE_CREATE_VIEW_STATEMENT);
            prefixOK = false;
            break;
        case 2:
            setFirstTknIndex(0);
            setLastTknIndex(1);
            Token firstToken = getToken(0);
            Token secondToken = getToken(1);
            if(!"VIEW".equalsIgnoreCase(secondToken.image)) {
                this.analyzer.addException(
                        getToken(0),
                        getToken(0),
                        Messages.Error.STATEMENT_MUST_START_WITH_CREATE_VIEW);
            }
            this.analyzer.addException(
                    firstToken,
                    secondToken,
                    Messages.Error.INCOMPLETE_CREATE_VIEW_STATEMENT);
            prefixOK = false;
            break;
        default:
        }

        if (!prefixOK) {
            return false;
        }
        // numTokens >= 3

        Token firstToken = getToken(0);
        Token secondToken = getToken(1);
        this.viewNameToken = getToken(2);

        if(!"CREATE".equalsIgnoreCase(firstToken.image) ||
           !"VIEW".equalsIgnoreCase(secondToken.image)) {
            this.analyzer.addException(
                    firstToken,
                    secondToken,
                    Messages.Error.STATEMENT_MUST_START_WITH_CREATE_VIEW);
        }

        if( this.viewNameToken.kind == SQLParserConstants.ID || this.viewNameToken.kind == SQLParserConstants.STRINGVAL ) {
            // ALL OK with first 3 Tokens
            setFirstTknIndex(0);
            setLastTknIndex(2);
        } else {
            // view name is invalid. log exception and return to continue parsing
            if( isReservedKeywordToken(viewNameToken) ) {
                DdlAnalyzerException exception = this.analyzer.addException(
                        this.viewNameToken,
                        this.viewNameToken,
                        Messages.getString(Messages.Error.VIEW_NAME_RESERVED_WORD, viewNameToken.image));
                exception.setErrorCode(
                        QuickFixFactory.DiagnosticErrorId.VIEW_NAME_RESERVED_WORD.getErrorCode());
                exception.setTargetedString(this.viewNameToken.image);
            } else if( isNonReservedKeywordToken(viewNameToken) ) {
                DdlAnalyzerException exception = this.analyzer.addException(
                        this.viewNameToken,
                        this.viewNameToken,
                        Messages.getString(Messages.Error.VIEW_NAME_NON_RESERVED_WORD, viewNameToken.image));
                exception.setErrorCode(QuickFixFactory.DiagnosticErrorId.VIEW_NAME_NON_RESERVED_WORD.getErrorCode());
                exception.setTargetedString(this.viewNameToken.image);
                exception.getDiagnostic().setSeverity(DiagnosticSeverity.Warning);
            } else {
                this.analyzer.addException(
                        this.viewNameToken,
                        this.viewNameToken,
                        Messages.getString(Messages.Error.VIEW_NAME_IS_INVALID, viewNameToken.image));
            }
        }

        incrementIndex(2);
        return true;
    }

    private void parseTableBody() {
        incrementIndex();
//        tableBody.setFirstTknIndex(4);
        // Now parse each table element
        // Break up table body into TableElements based on finding a "comma"
        tableBody.parseAndValidate();
    }

    private boolean isOk(DdlAnalyzerException exception) {
        if( exception == null ) {
            return true;
        }

        this.analyzer.addException(exception);

        return false;
    }

    private String getTokenValue(int tokenIndex) {
        return getToken(tokenIndex).image;
    }

    public List<DdlAnalyzerException> getExceptions() {
        return this.analyzer.getExceptions();
    }

    @Override
    public TokenContext getTokenContext(Position position) {
        if( isBetween(getFirstTknIndex(), getLastTknIndex(), position) ) {
            // PREFIX token
            return new TokenContext(position, this.analyzer.getTokenFor(position), DdlAnalyzerConstants.Context.PREFIX, this);
        } else if( isBetween(tableBody.getFirstTknIndex(),
                             tableBody.getLastTknIndex(), position) ) {
            // TABLE BODY
            return tableBody.getTokenContext(position);
        } else if( tableBody.getOptions() != null &&
                   isBetween(tableBody.getOptions().getFirstTknIndex(),
                             tableBody.getOptions().getLastTknIndex()+1, position) ) {
            // TABLE OPTIONS
            return tableBody.getOptions().getTokenContext(position);
        } else if( withClause != null && isBetween(withClause.getFirstTknIndex(),
                withClause.getLastTknIndex(), position) ) {
            return withClause.getTokenContext(position);
        } else if( queryExpression != null && isBetween(queryExpression.getFirstTknIndex(),
                queryExpression.getLastTknIndex(), position) ) {
        return queryExpression.getTokenContext(position);
        }

        return new TokenContext(position, null, DdlAnalyzerConstants.Context.NONE_FOUND, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(75);

        sb.append("CREATE VIEW");
        append(viewNameToken, sb);
        append(tableBody, sb);
        append("AS", sb);
        append(withClause, sb);
        append(queryExpression, sb);

        return sb.toString();
    }
}

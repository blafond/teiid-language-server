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

import org.eclipse.lsp4j.Position;
import org.teiid.lsp.parser.DdlAnalyzerConstants;
import org.teiid.lsp.parser.DdlTokenAnalyzer;
import org.teiid.lsp.parser.Token;

public class TableOptionsClause extends OptionsClause {

    public TableOptionsClause(DdlTokenAnalyzer analyzer) {
        super(analyzer);
    }

    @Override
    protected TokenContext getTokenContext(Position position) {
        boolean isInOptions = isBetween(getFirstTknIndex(), getLastTknIndex(), position);
        if( isInOptions ) {
            Token tkn = this.analyzer.getTokenFor(position);
            return new TokenContext(position, tkn, DdlAnalyzerConstants.Context.TABLE_OPTIONS, this);
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //.append("TABLE OPTIONS:");

        if( !getOptionsTokens().isEmpty()) {
            // looking for comma separated token pairs
            for( Token tkn: getOptionsTokens()) {
                sb.append(tkn);
            }
            sb.append("");
        }

        return sb.toString();
    }
}

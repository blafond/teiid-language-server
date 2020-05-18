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
package org.teiid.lsp.completion.providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionItemKind;
import org.eclipse.lsp4j.InsertTextFormat;
import org.teiid.lsp.parser.DdlAnalyzerConstants.Context;
import org.teiid.lsp.parser.SQLParserConstants;
import org.teiid.lsp.parser.Token;
import org.teiid.lsp.parser.statement.TokenContext;

/**
 * Provides completion items for a table body based on context of the targeted
 * token
 *
 */
public class TableBodyCompletionProvider extends CompletionItemBuilder {

    public List<CompletionItem> getCompletionItems(TokenContext context) {
        List<CompletionItem> items = new ArrayList<CompletionItem>();

        Token targetToken = context.getToken();

        System.out.println(" TableBodyCompletionProvider().getCompletionItems() targetToken = " + targetToken.image);
        if (context.getContext() == Context.TABLE_OPTIONS) {
        	System.out.println("  context = TABLE_OPTIONS");
            items.addAll(getItemLoader().getTableBodyOptionsCompletionItems());
        } else {
            if (targetToken.kind == SQLParserConstants.RPAREN) {
            	System.out.println("  tokenKind = RPAREN");
                items.add(getAs(1));
                items.add(getQueryExpressionSnippet(2));
                String details = "OPTIONS properties are comma separated key-value pairs in the form: OPTION(...  KEY 'some value')";
                items.add(generateCompletionItem("OPTIONS", null, details, "OPTIONS()"));
            } else {
            	System.out.println("  tokenKind = ... other ...");
                items.add(getColumnCompletionItem(1));
                items.add(getPrimaryKeyCompletionItem(2));
                items.add(getForeignKeyCompletionItem(3));
                System.out.println("    added 3 items....");
                // Add FOREIGN and PRIMARY
                CompletionItem item = getItemLoader().getItem(DdlCompletionItemLoader.ItemType.TABLE_ELEMENT,"FOREIGN");
                System.out.println("    xxxxxxx ");
                if( item != null ) {
                    items.add(item);
                }
                item = getItemLoader().getItem(DdlCompletionItemLoader.ItemType.TABLE_ELEMENT,"PRIMARY");
                System.out.println("    yyyyyyy ");
                if( item != null ) {
                    items.add(item);
                }
            }
        }
        System.out.println(" TableBodyCompletionProvider().getCompletionItems() # items = " + items.size());
        return items;
    }

    public CompletionItem getColumnCompletionItem(int data) {
        CompletionItem ci = new CompletionItem();
        ci.setLabel("column definition");
        ci.setInsertText("${1:column_name} ${2:datatype}");
        ci.setKind(CompletionItemKind.Snippet);
        ci.setInsertTextFormat(InsertTextFormat.Snippet);
        ci.setDocumentation(CompletionItemBuilder.beautifyDocument(ci.getInsertText()));
        ci.setData(data);
        ci.setPreselect(true);
        ci.setSortText("1100");
        return ci;
    }

    public CompletionItem getPrimaryKeyCompletionItem(int data) {
        CompletionItem ci = new CompletionItem();
        ci.setLabel("PRIMARY KEY (column, ...)");
        ci.setInsertText("PRIMARY KEY (${1:column})");
        ci.setKind(CompletionItemKind.Snippet);
        ci.setInsertTextFormat(InsertTextFormat.Snippet);
        ci.setDocumentation(CompletionItemBuilder.beautifyDocument(ci.getInsertText()));
        ci.setData(data);
        ci.setPreselect(true);
        ci.setSortText("1120");
        return ci;
    }

    public CompletionItem getForeignKeyCompletionItem(int data) {
        CompletionItem ci = new CompletionItem();
        ci.setLabel("FOREIGN KEY (c1, ...) tblRef (c1, ...)");
        ci.setInsertText("FOREIGN KEY (${1:column}) ${2:tblRef} (${3:column})") ;
        ci.setKind(CompletionItemKind.Snippet);
        ci.setInsertTextFormat(InsertTextFormat.Snippet);
        ci.setDocumentation(CompletionItemBuilder.beautifyDocument(ci.getInsertText()));
        ci.setData(data);
        ci.setPreselect(true);
        ci.setSortText("1130");
        return ci;
    }

    public CompletionItem getQueryExpressionSnippet(int data) {
        CompletionItem ci = new CompletionItem();
        ci.setLabel("AS SELECT * FROM ...");
        ci.setInsertText(" AS SELECT * FROM ${4:table_name};");
        ci.setKind(CompletionItemKind.Snippet);
        ci.setInsertTextFormat(InsertTextFormat.Snippet);
        ci.setDocumentation(CompletionItemBuilder.beautifyDocument(ci.getInsertText()));
        ci.setData(data);
        ci.setPreselect(true);
        return ci;
    }

    public CompletionItem getAs(int data) {
        CompletionItem ci = new CompletionItem();
        ci.setLabel("AS");
        ci.setKind(CompletionItemKind.Keyword);
        ci.setData(data);
        ci.setPreselect(true);
        return ci;
    }

    public String getLabel(int keywordId) {
        String tokenImageStr = SQLParserConstants.tokenImage[keywordId].toUpperCase(Locale.US);
        return tokenImageStr.substring(1, tokenImageStr.length() - 1);
    }
}

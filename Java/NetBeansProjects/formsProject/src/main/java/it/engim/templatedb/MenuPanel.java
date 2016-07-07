/*
 * Copyright 2016 svilupposw.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.engim.templatedb;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;


/**
 *
 * @author svilupposw
 */
public class MenuPanel extends Panel {
    
    public MenuPanel(String id) {
        super(id);
        
        BookmarkablePageLink home =
                new BookmarkablePageLink("home", HomePage.class);
        add(home);
        
        BookmarkablePageLink contattaci =
                new BookmarkablePageLink("contattaci", Contattaci.class);
        add(contattaci);
        
        BookmarkablePageLink contatti =
                new BookmarkablePageLink("contatti", ContattiList.class);
        add(contatti);
        
        
       /* BookmarkablePageLink cosafacciamo =
                new BookmarkablePageLink("cosafacciamo", CosaFacciamo.class);
        add(cosafacciamo);
        
        BookmarkablePageLink elencoclienti =
                new BookmarkablePageLink("elencoclienti", ElencoClienti.class);
        add(elencoclienti);*/
        
    }
    
}


package it.engim.templatedb;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;


/**
 *
 * @author svilupposw
 */
public class FooterPanel extends Panel {
    
    public FooterPanel(String id) {
        super(id);
        
        BookmarkablePageLink home =
                new BookmarkablePageLink("homeFoot", HomePage.class);
        add(home);
        
        BookmarkablePageLink articoli =
                new BookmarkablePageLink("articoliFoot", ElencoArticoli.class);
        add(articoli);
        
        BookmarkablePageLink ordini =
                new BookmarkablePageLink("ordiniFoot", ElencoOrdini.class);
        add(ordini);
        
        BookmarkablePageLink tariffe =
                new BookmarkablePageLink("tariffeFoot", ElencoTariffe.class);
        add(tariffe);
        
    
        
    }
    
}

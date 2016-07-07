
package it.engim.templatedb;

import it.engim.templatedb.beans.Contatti;
import it.engim.templatedb.beans.ContattiDataProvider;
import java.util.ArrayList;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author svilupposw
 */
public class ContattiList extends WebPage{
    
    public ContattiList(PageParameters parameters)
    {
        super(parameters);
        ArrayList<IColumn<Contatti, String>> colonne = new ArrayList<IColumn<Contatti, String>>();
        
        colonne.add(new PropertyColumn<Contatti ,String>
        (Model.of("Numero"),"id"));
        colonne.add(new PropertyColumn<Contatti ,String>
        (Model.of("Email"),"email"));
        colonne.add(new PropertyColumn<Contatti ,String>
        (Model.of("Messaggio"),"richiesta"));
        
        add(new DefaultDataTable<Contatti, String>(
                "contatti" , colonne,
                new ContattiDataProvider(),10));
        add(new MenuPanel("menu"));
    }
    
}

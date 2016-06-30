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

import models.Ordine;
import models.OrdineDataProvider;
import java.util.ArrayList;
import org.apache.wicket.extensions.markup.html.repeater.data.grid.ICellPopulator;
import org.apache.wicket.extensions.markup.html.repeater.data.table.AbstractColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.DefaultDataTable;
import org.apache.wicket.extensions.markup.html.repeater.data.table.IColumn;
import org.apache.wicket.extensions.markup.html.repeater.data.table.PropertyColumn;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author svilupposw
 */
public class ElencoOrdini extends WebPage{
    
    public ElencoOrdini(PageParameters parameters)
    {
        super(parameters);
        ArrayList<IColumn<Ordine, String>> colonne = new ArrayList<IColumn<Ordine, String>>();
        
        colonne.add(new PropertyColumn<Ordine ,String>
        (Model.of("Numero"),"numero"));
        colonne.add(new PropertyColumn<Ordine ,String>
        (Model.of("Data"),"data"));
        colonne.add(new AbstractColumn<Ordine, String>
        (Model.of("Tariffa migliore")) 
        {
            @Override
            public void populateItem(Item<ICellPopulator<Ordine>> item,
                    String wicketId,
                    IModel<Ordine> imodel) 
            {
               
               item.add(new Label(wicketId,item.getId()));
            }
        });
        
        add(new DefaultDataTable<Ordine, String>(
                "ordini" , colonne,
                new OrdineDataProvider(),10));
        add(new MenuPanel("menu"));
    }
    
}

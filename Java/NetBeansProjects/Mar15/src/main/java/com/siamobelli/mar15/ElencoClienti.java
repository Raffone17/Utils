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
package com.siamobelli.mar15;

import com.siamobelli.mar15.models.Cliente;
import com.siamobelli.mar15.models.ClienteDataProvider;
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
public class ElencoClienti extends HomePage{
    
    public ElencoClienti(PageParameters parameters)
    {
        super(parameters);
        ArrayList<IColumn<Cliente, String>> colonne = new ArrayList<IColumn<Cliente, String>>();
        
        colonne.add(new PropertyColumn<Cliente ,String>
        (Model.of("Codice"),"id"));
        colonne.add(new PropertyColumn<Cliente ,String>
        (Model.of("Nome"),"nome"));
        colonne.add(new PropertyColumn<Cliente ,String>
        (Model.of("Cognome"),"cognome"));
        
        add(new DefaultDataTable<Cliente, String>(
                "clienti" , colonne,
                new ClienteDataProvider(),10));
    }
    
}

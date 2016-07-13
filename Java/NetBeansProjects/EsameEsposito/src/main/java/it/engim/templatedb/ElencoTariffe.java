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

import models.TariffeCorriere;
import models.TariffeCorriereDataProvider;
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
public class ElencoTariffe extends WebPage{
    
    public ElencoTariffe(PageParameters parameters)
    {
        super(parameters);
        ArrayList<IColumn<TariffeCorriere, String>> colonne = new ArrayList<IColumn<TariffeCorriere, String>>();
        
        colonne.add(new PropertyColumn<TariffeCorriere ,String>
        (Model.of("Id"),"id"));
        colonne.add(new PropertyColumn<TariffeCorriere ,String>
        (Model.of("Nome"),"nomeCorriere"));
        colonne.add(new PropertyColumn<TariffeCorriere ,String>
        (Model.of("Tariffa"),"nomeTariffa"));
        colonne.add(new PropertyColumn<TariffeCorriere ,String>
        (Model.of("Peso Massimo"),"pesoMassimo"));
        colonne.add(new PropertyColumn<TariffeCorriere ,String>
        (Model.of("Costo"),"costo"));
        
        add(new DefaultDataTable<TariffeCorriere, String>(
                "tariffe" , colonne,
                new TariffeCorriereDataProvider(),10));
        add(new MenuPanel("menu"));
        add(new FooterPanel("footer"));
    }
    
}

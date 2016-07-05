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
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 *
 * @author svilupposw
 */
public class Contattaci extends WebPage{
    
    private ContattoBean dati;

    public Contattaci()
    {
        dati = new ContattoBean();
        CompoundPropertyModel<ContattoBean> 
           model = new CompoundPropertyModel<>(dati);
                
        Form c;
        c = new Form("formcontatti",model)
        {
            @Override
            protected void onSubmit() 
            {
                super.onSubmit(); //To change body of generated methods, choose Tools | Templates.
                System.out.println(dati.getEmail());
            }
           
            
        };
        TextField email = new TextField("email");
        c.add(email);
        TextArea ric = new TextArea("richiesta");
        c.add(ric);
        add(c);
        add(new MenuPanel("menu"));
        
        
       
    }
    
    
}

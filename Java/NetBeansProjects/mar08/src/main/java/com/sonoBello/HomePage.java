package com.sonoBello;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) 
        {
		super(parameters);
               
                
                String versione = getApplication().getFrameworkSettings().getVersion();
                
                Label labvers = new Label("version", versione);
               
                String nome = "Raffone";
		add(labvers);
                Label saluto = new Label("saluto",nome);
                //add(new Label("saluto", nome));
                add(saluto);

		// TODO Add your page's components here

        }
}

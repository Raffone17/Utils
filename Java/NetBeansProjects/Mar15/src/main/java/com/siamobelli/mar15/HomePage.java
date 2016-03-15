package com.siamobelli.mar15;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.LabeledWebMarkupContainer;
import org.apache.wicket.markup.repeater.RepeatingView;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		

		DocumentoPanel doc = new DocumentoPanel("docum");
                MenuPanel menu = new MenuPanel("menu");
                add(doc);
                add(menu);
                
                RepeatingView tab = new RepeatingView("riga");
                tab.add(new Label(tab.newChildId(),"riga1"));
                tab.add(new Label(tab.newChildId(),"riga2"));
                tab.add(new Label(tab.newChildId(),"riga3"));
                tab.add(new Label(tab.newChildId(),"riga4"));
                tab.add(new Label(tab.newChildId(),"riga5"));
                tab.add(new Label(tab.newChildId(),
                        "chi ama la (|) metta una riga"));
                
                add(tab);

    }
}

package com.siamobelli.mar15;

import com.siamobelli.mar15.models.Persona;
import java.util.Date;
import javax.persistence.EntityManager;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.LabeledWebMarkupContainer;
import org.apache.wicket.markup.repeater.RepeatingView;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		String nome, cognome;
                

		DocumentoPanel doc = new DocumentoPanel("docum");
                MenuPanel menu = new MenuPanel("menu");
                add(doc);
                add(menu);
                
                
                
                EntityManager conn = PM.getEM();
                
                try{
                  RepeatingView tab = new RepeatingView("riga");
                   for(int i=1; i<=6; i++){
                    Persona p;
                    p = conn.find(Persona.class, i);
                    
                    nome = p.getNome();
                    cognome = p.getCognome();
                    Date data = p.getDataNascita();
                   
                    tab.add(new Label(tab.newChildId(), "-Nome: "+nome+" --Cognome: "+cognome+
                            " -Data nascita: "+data ));
                    
                   }
                   add(tab);

                    
                }catch (Exception exc){
                    nome="Non Trovato!";
                    cognome="Non Trovato!";
                    
                }finally{
                    
                    conn.close();
                }
                
                
                
                
               /* tab.add(new Label(tab.newChildId(),"riga1"));
                tab.add(new Label(tab.newChildId(), "Nome: "+nome));
                tab.add(new Label(tab.newChildId(), "Cognome: "+cognome));
                tab.add(new Label(tab.newChildId(),"riga4"));
                tab.add(new Label(tab.newChildId(),"riga5"));
                tab.add(new Label(tab.newChildId(),
                        "chi ama la (|) metta una riga"));*/
                
                
    }
}

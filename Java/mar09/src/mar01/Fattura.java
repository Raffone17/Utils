/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar01;

import java.util.Date;

/**
 *
 * @author svilupposw
 */
public class Fattura extends Documento{
    private Date scadenza ;
    private float totale ;

    public Fattura() {
        
    }

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    public float getTotale() {
        return totale;
    }

    public void setTotale(float totale) {
        this.totale = totale;
    }

    @Override 
    //override con la @ è un annotazione a dare un informazione aggiuntiva sul codice 
    //vuol dire che un metodo sostituisce dello della classe base 
    public void stampa() {
        System.out.println(this.getNome());
    }
    
    
}
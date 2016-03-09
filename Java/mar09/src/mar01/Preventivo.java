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
public class Preventivo extends Documento{
    
     private Date scadenza ;

    public Date getScadenza() {
        return scadenza;
    }

    public void setScadenza(Date scadenza) {
        this.scadenza = scadenza;
    }

    @Override
    public void stampa() {
           System.out.println("prentivo");
    }
     
    
    
}
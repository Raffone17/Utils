/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar01;

/**
 *
 * @author svilupposw
 */
public class Commessa  extends Documento{
    private int codice;
    private String descrizione ;

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    
    @Override
    public void stampa() {
       System.out.println(getDescrizione());
    }
    
}
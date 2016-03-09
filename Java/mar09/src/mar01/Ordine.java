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
public class Ordine extends Documento{

    private int number;
    private String aziendaRichiedente;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAziendaRichiedente() {
        return aziendaRichiedente;
    }

    public void setAziendaRichiedente(String aziendaRichiedente) {
        this.aziendaRichiedente = aziendaRichiedente;
    }
    
    
    
    @Override
    public void stampa() {
        System.out.println("Ordine");
    }
    
}
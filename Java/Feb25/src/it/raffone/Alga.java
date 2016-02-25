/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.raffone;

/**
 *
 * @author svilupposw
 */
public class Alga extends Arbusto{
    boolean commestibile;
    String mare;

    public boolean isCommestibile() {
        return commestibile;
    }

    public void setCommestibile(boolean commestibile) {
        this.commestibile = commestibile;
    }

    public String getMare() {
        return mare;
    }

    public void setMare(String mare) {
        this.mare = mare;
    }
    
    public void stampa()
    {
        String frase = "L'alga "+ getNome() +
                ", che ha al.media di "+getAltezzaMedia()+
                (isCommestibile() ? "" : "non")+
                " è commestibile";
        System.out.println(frase);
    }
    
    
}

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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vegetale pino = new Vegetale();
        pino.setNome("Pinus vulgaris");
        
        Alga nori = new Alga();
        nori.setNome("Non lo so");
        nori.setCommestibile(true);
        nori.stampa();
    }
    
}

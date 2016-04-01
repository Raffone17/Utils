/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;

import java.util.ArrayList;
import java.util.List;

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
        int i;
        Persona persona;
        ContoCorrente conto;
        Banca miaBanca;
        List<ContoCorrente> listaConti = new ArrayList <ContoCorrente>();
        
        
        persona = new Persona("Tizio","Caio","JFKO30DSHKL230DFJ");
        conto = new ContoCorrente(1, persona, 12456);
        listaConti.add(conto);
        
        persona = new Persona("Bella","Stronza","KDO3K459GJS902KD");
        conto = new ContoCorrente(2, persona, 25856);
        listaConti.add(conto);
        
        persona = new Persona("Felice","Mastronzo","FO23905KLVNKDO3S");
        conto = new ContoCorrente(3, persona, 7685);
        listaConti.add(conto);
        
        miaBanca = new Banca("Unipol",46571,listaConti);
        System.out.println(miaBanca);
        persona = new Persona("Felice","Mastronzo","FO23905KLVNKDO3S");
        conto = new ContoCorrente(4, persona, 8685);
        System.out.println("\nAggiungo il conto : "+conto+" \n*******");
        miaBanca.addContoCorrente(conto);
        System.out.println(miaBanca);
        
        System.out.println("\nPrendo Conto KDO3K459GJS902KD : **********");
        conto = miaBanca.getContoCorrente("KDO3K459GJS902KD");
        System.out.println(conto);
        
        System.out.println("Faccio deposito a 3 ******");
        miaBanca.faiDeposito(3,2654);
        System.out.println(miaBanca);
        
        System.out.println("Faccio prelievo a 2 *******");
        miaBanca.faiPrelievo(2,1600);
        System.out.println(miaBanca);
        
        System.out.println("Faccio bonifico da 2 a 1 *******");
        miaBanca.faiBonifico(2,1,5600);
        System.out.println(miaBanca);
        
        System.out.println("Rimuvo conto 4 ***********");
        miaBanca.removeContoCorrente(4);
        System.out.println(miaBanca);
        
    }
    
}

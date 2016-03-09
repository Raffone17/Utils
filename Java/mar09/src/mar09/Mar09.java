/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar09;

/**
 *
 * @author svilupposw
 */
import java.util.ArrayList;
import mar01.Documento;
import mar01.Fattura;
import mar01.Ordine;

public class Mar09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       ArrayList<String> rubrica = new ArrayList<>();
       rubrica.add("Lucio Crusca 349163945");
      
       
       String voceInRubrica = rubrica.get(0);
       
       ArrayList<Integer> temperature = new ArrayList<>();
       temperature.add(17);
       temperature.add(19);
       temperature.add(14);
       
       int temp = temperature.get(0);
       
       for (int t: temperature){
           System.out.println(t);
       }
       
       ArrayList<Documento> docs = new ArrayList<>();
       docs.add(new Fattura());
       
       ContenitoreGenerico<Fattura> cg = new ContenitoreGenerico<>();
       cg.setContenuto(new Fattura());
       
       Fattura voce = cg.getContenuto();
       
       Class<? extends Documento> descriviOrdine;
        descriviOrdine = Ordine.class;
    }
    
}

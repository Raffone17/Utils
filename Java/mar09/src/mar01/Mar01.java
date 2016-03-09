/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar01;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author svilupposw
 */

public class Mar01 {
    
     
    
    
    public static void main(String[] args) {
        // TODO code application logic here

     Documento[] docs =
         {
         new Fattura(),
         new Fattura(),
         new Preventivo(),
         new Fattura(),
         new Commessa(),
         new Ddt()
         };
     docs[0].setNome("pippo"); 
     int i=0;
     docs[0].setIndirizzo("ciao");
     
            for(Documento d: docs){
                d.setIndirizzo("indirizzo"+i);
                d.setDataEmissione(new Date());
                d.stampa();
              
            
            
            }
     }       
}
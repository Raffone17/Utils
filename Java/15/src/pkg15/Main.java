/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;

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
        Contatto tizio;
        Rubrica miaRubrica = new Rubrica("patate");
        
       tizio = new Contatto("Tizio","Caio","tizio@email.com","3456874241");
       miaRubrica.addContatto(tizio);
       tizio = new Contatto("Felica","Mastronzo","felice@email.com","3658713256");
       miaRubrica.addContatto(tizio);
       tizio = new Contatto("Mario","Rossi","mario@email.com","3897456321");
       miaRubrica.addContatto(tizio);
        
       System.out.println(miaRubrica);
       System.out.println(miaRubrica.getContatto(2));
       System.out.println(miaRubrica.getShuffleLista());
       System.out.println(miaRubrica.removeContatto(0));
       System.out.println(miaRubrica.getContattoByCognome("Mastronzo"));
       System.out.println(miaRubrica);
    }
    
}

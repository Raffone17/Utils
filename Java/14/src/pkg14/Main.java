/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

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
        Studente tizio;
        int sommaAnni; 
        Classe miaClasse = new Classe("Cavolo");
        
        
        tizio = new Studente("Tizio","Caio",24);
        miaClasse.addStudnete(tizio);
        tizio = new Studente("Felica","Mastronzo",31);
        miaClasse.addStudnete(tizio);
        tizio = new Studente("Sempronio","Triste",18);
        miaClasse.addStudnete(tizio);
        tizio = new Studente("Mario","Rossi",22);
        miaClasse.addStudnete(tizio);
        
        System.out.println(miaClasse);
        
        
        if(miaClasse.esisteStudente("Rossi")){
            System.out.println("Esiste un tizio Rossi");
        }
        if(!miaClasse.esisteStudente("Coso")){
           System.out.println("Non Esiste un tizio Coso"); 
        }
        
        sommaAnni = miaClasse.sommaAnni();
        System.out.println("La somma dei anni è: "+sommaAnni);
        System.out.println("Lo studente più vecchio è: "+miaClasse.getVecchio());
        
        miaClasse.rimuoviStudente("Mastronzo");
        System.out.println("\nLista ordinata: \n"+ miaClasse.getListaOrdinataStudenti());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

import java.sql.SQLException;

/**
 *
 * @author svilupposw
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        //ConnectionManager.getConnectionWithDataSource();
        //int num = ConnectionManager.getNumeroProvince(1);
        //System.out.println("Numero Province: "+num);
        
        //num = ConnectionManager.getIdRegione("piemonte");
        //System.out.println("Numero ID: "+num);
        
        //Regione piemonte = new Regione("piemonte");
        Provincia[] listaProvincie;
        
        for(int i=1; i<=20; i++){
            Regione regione = new Regione(i);
            System.out.println(regione);
            listaProvincie = regione.getListaProvincie();
            for (Provincia listaProvincie1 : listaProvincie) {
                System.out.println(listaProvincie1);
            }
            
        }
        
        
    }
    
}

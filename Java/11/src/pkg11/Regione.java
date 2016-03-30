/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;


/**
 *
 * @author svilupposw
 */
public class Regione {
    
    private int id;
    private String nome;
    private Provincia[] listaProvincie;
    
     public Regione(String nome) {
         
    	this.id = ConnectionManager.getIdRegione(nome);
        this.nome = nome;
        this.listaProvincie = ConnectionManager.getNomeProvincie(this.id);
    }
     
     public Regione(int id) {
         
        this.id = id;
    	this.nome = ConnectionManager.getNomeRegione(id);
        this.listaProvincie = ConnectionManager.getNomeProvincie(this.id);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Provincia[] getListaProvincie() {
        return listaProvincie;
    }

    public void setListaProvincie(Provincia[] listaProvincie) {
        this.listaProvincie = listaProvincie;
    }

 

    @Override
    public String toString() {
        return "Regione n° "+this.id+" -nome: "+this.nome+
                " -numero provincie: "+listaProvincie.length;
    }

   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author svilupposw
 */
public class Regione {
    
    private int id;
    private String nome;
    private String[] provincie;
    
     public Regione(String nome) {
         
    	this.id = ConnectionManager.getIdRegione(nome);
        this.nome = nome;
        this.provincie = ConnectionManager.getNomeProvincie(this.id);
    }
     
     public Regione(int id) {
         
        this.id = id;
    	this.nome = ConnectionManager.getNomeRegione(id);
        this.provincie = ConnectionManager.getNomeProvincie(this.id);
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

    public String[] getProvincie() {
        return provincie;
    }

    public void setProvincie(String[] provincie) {
        this.provincie = provincie;
    }

    @Override
    public String toString() {
        return "Regione n° "+this.id+" -nome: "+this.nome+
                " -numero provincie: "+provincie.length;
    }

   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

import java.util.Random;

/**
 *
 * @author svilupposw
 */
public class Studente implements Comparable {
    static int count = 1000;
    
    private final int matricola;
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.matricola = count++;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Studente con: " + "matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "\n";
    }

    @Override
    public int compareTo(Object t) {
       Studente obj = (Studente)t;
       
       if(this.eta < obj.getEta()){
           return -1;
       }else if(this.eta > obj.getEta()){
           return 1;
       }
       
       return 0;
    }
    
}

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
public class Contatto implements Comparable<Contatto> {
    private String nome;
    private String cognome;
    private String email;
    private String telegfono;

    public Contatto(String nome, String cognome, String email, String telegfono) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telegfono = telegfono;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelegfono() {
        return telegfono;
    }

    public void setTelegfono(String telegfono) {
        this.telegfono = telegfono;
    }

    @Override
    public String toString() {
        return "\nContatto: " + "nome= " + nome + ", cognome= " + cognome + ", email= " + email + ", telegfono= " + telegfono ;
    }

    @Override
    public int compareTo(Contatto t) {
       
           return this.getCognome().compareTo(t.getCognome());
      
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;

/**
 *
 * @author svilupposw
 */
public class Persona {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Persona(String nome,String cognome,String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    


    @Override
    public String toString() {
        return "Persona con: " + "nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale +"\n";
    }
    
    
}

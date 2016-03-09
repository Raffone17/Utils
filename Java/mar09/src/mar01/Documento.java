/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar01;

import java.util.Date;

/**
 *
 * @author svilupposw
 */
public abstract  class Documento {
    private String nome;
    private String cognome;
    private String pIva;
    private String indirizzo ;
    private int numero ;
    private Date dataEmissione;

//costruttore
    public Documento(){
        dataEmissione=new Date();
    
    }
    public Documento(String nome, String cognome, String pIva, String indirizzo, int numero, Date dataEmissione) {
        this.nome = nome;
        this.cognome = cognome;
        this.pIva = pIva;
        this.indirizzo = indirizzo;
        this.numero = numero;
        this.dataEmissione = dataEmissione;
    }

    
//metodi getter e resetter    
    
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

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataEmissione() {
        return dataEmissione;
    }

    public void setDataEmissione(Date dataEmissione) {
        this.dataEmissione = dataEmissione;
    }
            
   
    public abstract  void stampa() ;

    public int confronta(Documento documento) {
        /**
         * questo metodo in una riga permette di scrivere i tre if
         */
        //return getNumero() - documento.getNumero();
        
        if(this.getNumero() < documento.getNumero())
            return -1;
        if(this.getNumero() == documento.getNumero())
            return 0;
        else
            return 100;
    }
}
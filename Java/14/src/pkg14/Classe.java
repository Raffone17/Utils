/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author svilupposw
 */
public class Classe {
    private String nome;
    private List<Studente> listaStudenti = new ArrayList <Studente>();
    

    public Classe(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }
    
    public void addStudnete(Studente tizio)
    {
        this.listaStudenti.add(tizio);
    }
    public boolean esisteStudente(String cognome)
    {
        Iterator<Studente> iterator = this.listaStudenti.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getCognome().equals(cognome)){
                return true;
            }
        }
        
        return false;
    }
    public int sommaAnni()
    {
        int somma=0;
        
        Iterator<Studente> iterator = this.listaStudenti.iterator();
        while(iterator.hasNext()){
            
            somma += iterator.next().getEta();
            
            }
        return somma;
        
    }
    public Studente getVecchio()
    {
        Studente attuale;
        Studente vecchio = null;
        
        Iterator<Studente> iterator = this.listaStudenti.iterator();
        while(iterator.hasNext()){
            attuale = iterator.next();
           if(vecchio != null){
                if(attuale.getEta() > vecchio.getEta()){
                     vecchio = attuale;
                }
                
           }else{
               vecchio = attuale;
           }
            
        }
        
        return vecchio;
    }
    public boolean rimuoviStudente(String cognome){
        
        Iterator<Studente> iterator = this.listaStudenti.iterator();
        
        while(iterator.hasNext()){
            if(iterator.next().getCognome().equals(cognome)){
                iterator.remove();
                return true;
            }
        
        }
        return false;
    }
    
    public List<Studente> getListaOrdinataStudenti(){
        
           List<Studente> lista;
           
           lista = new ArrayList(this.listaStudenti);
           Collections.sort(lista);
           
           return lista;
    }

    @Override
    public String toString() {
        return "Classe con " + "nome=" + nome + ", \nlistaStudenti= " + listaStudenti + '}';
    }
    
    
    
    
}

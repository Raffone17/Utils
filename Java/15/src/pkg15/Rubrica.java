/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author svilupposw
 */
public class Rubrica {
    
     private String nome;
     private List<Contatto> listaContatti;
     HashMap<String, Contatto> hmap= new HashMap<String, Contatto>();

    public Rubrica(String nome) {
        this.nome = nome;
        this.listaContatti = new ArrayList<Contatto>();
     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
        //Collections.sort(this.listaContatti);
    }

    public void addContatto (Contatto tizio){
         //this.listaContatti.add(tizio);
         //Collections.sort(this.listaContatti);
         boolean add = false;
         
         if(this.listaContatti.isEmpty()){
             this.listaContatti.add(tizio);
             add = true;
         }
         for(int i=0; i<this.listaContatti.size() && add == false; i++){
             if(tizio.compareTo(this.listaContatti.get(i)) <= 0){
                this.listaContatti.add(i,tizio);
                add = true;
             }
         }
         if(add == false){
             this.listaContatti.add(tizio);
         }
         
         this.hmap.put( tizio.getCognome(),tizio);
         
    }
    public Contatto getContatto (int pos){
        Contatto toRet = null;
        
        if(pos <= this.listaContatti.size() && pos >= 0){
            toRet = this.listaContatti.get(pos);
        }
        
        return toRet;
    }
    public boolean removeContatto(int pos){
        
        this.hmap.remove(this.listaContatti.get(pos).getCognome());
        return this.listaContatti.remove(this.listaContatti.get(pos));
        
    }
    public Contatto getContattoByCognome(String cognome){
        Contatto toRet = null;
        
        if(this.hmap.containsKey(cognome)){
            toRet = this.hmap.get(cognome);
        }
        return toRet;
    }
    public List<Contatto> getShuffleLista(){
        List <Contatto> lista;
        lista = new ArrayList(this.listaContatti);
        
        Collections.shuffle(lista);
        
        return lista;
    }
    
    
    @Override
    public String toString() {
        return "Rubrica{" + "nome=" + nome + ", listaContatti=" + listaContatti + '}';
    }
     
    
    

    
     
     
    
}

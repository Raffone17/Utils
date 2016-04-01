/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author svilupposw
 */
public class Banca {
    private String nome;
    private int numeroFiliale;
    private List<ContoCorrente> listaConti = new ArrayList <ContoCorrente>();

    public Banca(String nome, int numeroFiliale, List listaConti) {
        this.nome = nome;
        this.numeroFiliale = numeroFiliale;
        this.listaConti = listaConti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFiliale() {
        return numeroFiliale;
    }

    public void setNumeroFiliale(int numeroFiliale) {
        this.numeroFiliale = numeroFiliale;
    }

    public List<ContoCorrente> getListaConti() {
        return listaConti;
    }

    public void setListaConti(List<ContoCorrente> listaConti) {
        this.listaConti = listaConti;
    }

    @Override
    public String toString() {
        return "Banca con: " + "nome=" + nome + ", numeroFiliale=" + numeroFiliale + ",\n listaConti=\n" + listaConti + '\n';
    }
    
    
    public boolean addContoCorrente(ContoCorrente conto)
    {
        
        boolean add = this.listaConti.add(conto);
        return add;
    }
    public boolean removeContoCorrente(int idConto)
    {
        
         ContoCorrente conto;
	//Iterator<ContoCorrente> iterator = this.listaConti.iterator();
        
	for (Iterator<ContoCorrente> iterator = this.listaConti.iterator(); iterator.hasNext();){
            conto = iterator.next();
            if (conto.getIdConto() == idConto){
                iterator.remove();
                return true;
            }
            
         }
        return false;
        
    }
    public ContoCorrente getContoCorrente(String codiceFiscale)
    {
        
        ContoCorrente conto;
        ContoCorrente toRet = null; 
        
        Iterator<ContoCorrente> iterator = this.listaConti.iterator();
        while(iterator.hasNext()){
            conto = iterator.next();
            if(conto.getIntestatario().getCodiceFiscale().equals(codiceFiscale)){
                toRet = conto;
            }
        }
        return toRet;
    }
    public int indexContoCorrente(int idConto){
        ContoCorrente conto;
        int i = -1;
      
        
        Iterator<ContoCorrente> iterator = this.listaConti.iterator();
        while(iterator.hasNext()){
            conto = iterator.next();
            if(idConto == conto.getIdConto()){
                i = this.listaConti.indexOf(conto);
              
                return i;
               
            }
           
        }
        
        return i;
        
    }
    public boolean faiDeposito(int idConto,float ammontare)
    {
        
        int i;
        
        if(ammontare > 0){
            i = this.indexContoCorrente(idConto);
            if(i != -1){
                this.listaConti.get(i).deposito(ammontare);
                return true;
            }
        }
        
        return false;
        
    } 
    public boolean faiPrelievo(int idConto,float ammontare)
    {
        
        int i;
        
        if(ammontare > 0){
            i = this.indexContoCorrente(idConto);
            if(i != -1){
                if(this.listaConti.get(i).prelievo(ammontare)){
                    return true;
                }

            }
        }
        
        return false;
        
    }
    public boolean faiBonifico(int idConto1, int idConto2, float ammontare)
    {
        int i,l;
        
        i = this.indexContoCorrente(idConto1);
        l = this.indexContoCorrente(idConto2);
        
        if(ammontare > 0){
            if(i>=0 && l>=0){
               if(this.listaConti.get(i).prelievo(ammontare)){
                   this.listaConti.get(l).deposito(ammontare);
                   return true;
               }
            }
        }
        return false;
    }
    
    
    
}

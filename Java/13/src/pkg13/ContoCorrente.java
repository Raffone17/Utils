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
public class ContoCorrente {
    private int idConto;
    private Persona intestatario;
    private float saldo;
    
    public ContoCorrente(int idConto,Persona intestatario,float saldo){
        this.idConto = idConto;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }
    
    public int getIdConto() {
        return idConto;
    }

    public void setIdConto(int idConto) {
        this.idConto = idConto;
    }

    
    public Persona getIntestatario() {
        return intestatario;
    }

    public void setIntestatario(Persona intestatario) {
        this.intestatario = intestatario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean deposito(float soldi){
        if(soldi > 0){
            this.saldo += soldi;
            return true;
        }
        return false;
    }
    public boolean prelievo(float soldi){
        if(this.saldo < soldi){
            return false;
        }
        this.saldo -= soldi;
        return true;
    }
    @Override
    public String toString() {
        return "ContoCorrente: " + "idConto=" + idConto + ", intestatario=" + intestatario + ", saldo=" + saldo + '\n';
    }

  
   

    
    
}

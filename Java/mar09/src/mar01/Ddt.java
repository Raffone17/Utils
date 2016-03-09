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
public class Ddt extends Documento {
    private Date partenza ;
    private Date arrivo ;
    private String luogoPartenza;
    private String luogoArrivo;

    public Date getPartenza() {
        return partenza;
    }

    public void setPartenza(Date partenza) {
        this.partenza = partenza;
    }

    public Date getArrivo() {
        return arrivo;
    }

    public void setArrivo(Date arrivo) {
        this.arrivo = arrivo;
    }

    public String getLuogoPartenza() {
        return luogoPartenza;
    }

    public void setLuogoPartenza(String luogoPartenza) {
        this.luogoPartenza = luogoPartenza;
    }

    public String getLuogoArrivo() {
        return luogoArrivo;
    }

    public void setLuogoArrivo(String luogoArrivo) {
        this.luogoArrivo = luogoArrivo;
    }
    
    @Override
    public void stampa() {
        System.out.println("ddt");
    }
    
    
    
}
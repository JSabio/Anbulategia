/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Arr1et4
 */
public class Ordutegia {
    
    private Date eguna;
    private Time ordua;
    private Gela gela;

    public Ordutegia() {
    }

    public Ordutegia(Date eguna, Time ordua, Gela gela) {
        this.eguna = eguna;
        this.ordua = ordua;
        this.gela = gela;
    }

    /**
     * @return the eguna
     */
    public Date getEguna() {
        return eguna;
    }

    /**
     * @param eguna the eguna to set
     */
    public void setEguna(Date eguna) {
        this.eguna = eguna;
    }

    /**
     * @return the ordua
     */
    public Time getOrdua() {
        return ordua;
    }

    /**
     * @param ordua the ordua to set
     */
    public void setOrdua(Time ordua) {
        this.ordua = ordua;
    }

    /**
     * @return the gela
     */
    public Gela getGela() {
        return gela;
    }

    /**
     * @param gela the gela to set
     */
    public void setGela(Gela gela) {
        this.gela = gela;
    }
    
}

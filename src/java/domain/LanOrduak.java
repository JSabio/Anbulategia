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
public class LanOrduak {
    
    private Date eguna;
    private Time ordua;

    public LanOrduak() {
    }

    public LanOrduak(Date eguna, Time ordua) {
        this.eguna = eguna;
        this.ordua = ordua;
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
    
}

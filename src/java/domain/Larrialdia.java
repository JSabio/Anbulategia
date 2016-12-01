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
public class Larrialdia {
    
    private Gaixoa gaixoa;
    private Date eguna;
    private Time ordua;
    private String adierazpena;

    public Larrialdia() {
    }

    public Larrialdia(Gaixoa gaixoa, Date eguna, Time ordua, String adierazpena) {
        this.gaixoa = gaixoa;
        this.eguna = eguna;
        this.ordua = ordua;
        this.adierazpena = adierazpena;
    }

    /**
     * @return the gaixoa
     */
    public Gaixoa getGaixoa() {
        return gaixoa;
    }

    /**
     * @param gaixoa the gaixoa to set
     */
    public void setGaixoa(Gaixoa gaixoa) {
        this.gaixoa = gaixoa;
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
     * @return the adierazpena
     */
    public String getAdierazpena() {
        return adierazpena;
    }

    /**
     * @param adierazpena the adierazpena to set
     */
    public void setAdierazpena(String adierazpena) {
        this.adierazpena = adierazpena;
    }
    
    
    
}

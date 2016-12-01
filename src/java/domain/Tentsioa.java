/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Arr1et4
 */
public class Tentsioa {
    
    private Date eguna;
    private double altua;
    private double baxua;

    public Tentsioa() {
    }

    public Tentsioa(Date eguna, double altua, double baxua) {
        this.eguna = eguna;
        this.altua = altua;
        this.baxua = baxua;
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
     * @return the altua
     */
    public double getAltua() {
        return altua;
    }

    /**
     * @param altua the altua to set
     */
    public void setAltua(double altua) {
        this.altua = altua;
    }

    /**
     * @return the baxua
     */
    public double getBaxua() {
        return baxua;
    }

    /**
     * @param baxua the baxua to set
     */
    public void setBaxua(double baxua) {
        this.baxua = baxua;
    }
    
    
}

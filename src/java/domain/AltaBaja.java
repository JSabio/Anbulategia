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
public class AltaBaja {
    
    private Gaixoa gaixoa;
    private String entrepresa;
    private String helbidea;
    private String herria;
    private String probintzia;
    private String azterketa;
    private Date eguna;
    private Date hurrengo;
    private int iraun;
    private Date baja;

    public AltaBaja() {
    }

    public AltaBaja(Gaixoa gaixoa, String entrepresa, String helbidea, String herria, String probintzia, String azterketa, Date eguna, Date hurrengo, int iraun, Date baja) {
        this.gaixoa = gaixoa;
        this.entrepresa = entrepresa;
        this.helbidea = helbidea;
        this.herria = herria;
        this.probintzia = probintzia;
        this.azterketa = azterketa;
        this.eguna = eguna;
        this.hurrengo = hurrengo;
        this.iraun = iraun;
        this.baja = baja;
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
     * @return the entrepresa
     */
    public String getEntrepresa() {
        return entrepresa;
    }

    /**
     * @param entrepresa the entrepresa to set
     */
    public void setEntrepresa(String entrepresa) {
        this.entrepresa = entrepresa;
    }

    /**
     * @return the helbidea
     */
    public String getHelbidea() {
        return helbidea;
    }

    /**
     * @param helbidea the helbidea to set
     */
    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    /**
     * @return the herria
     */
    public String getHerria() {
        return herria;
    }

    /**
     * @param herria the herria to set
     */
    public void setHerria(String herria) {
        this.herria = herria;
    }

    /**
     * @return the probintzia
     */
    public String getProbintzia() {
        return probintzia;
    }

    /**
     * @param probintzia the probintzia to set
     */
    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    /**
     * @return the azterketa
     */
    public String getAzterketa() {
        return azterketa;
    }

    /**
     * @param azterketa the azterketa to set
     */
    public void setAzterketa(String azterketa) {
        this.azterketa = azterketa;
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
     * @return the hurrengo
     */
    public Date getHurrengo() {
        return hurrengo;
    }

    /**
     * @param hurrengo the hurrengo to set
     */
    public void setHurrengo(Date hurrengo) {
        this.hurrengo = hurrengo;
    }

    /**
     * @return the iraun
     */
    public int getIraun() {
        return iraun;
    }

    /**
     * @param iraun the iraun to set
     */
    public void setIraun(int iraun) {
        this.iraun = iraun;
    }

    /**
     * @return the baja
     */
    public Date getBaja() {
        return baja;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja(Date baja) {
        this.baja = baja;
    }
    
}

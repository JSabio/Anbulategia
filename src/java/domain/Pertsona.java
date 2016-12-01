/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Arr1et4
 */
public abstract class Pertsona {
    
    private int gz;
    private String izena;
    private String abizenak;
    private int telefonoa;
    private String helbidea;

    public Pertsona() {
    }

    public Pertsona(int gz, String izena, String abizenak, int telefonoa, String helbidea) {
        this.gz = gz;
        this.izena = izena;
        this.abizenak = abizenak;
        this.telefonoa = telefonoa;
        this.helbidea = helbidea;
    }
    
    /**
     * @return the gz
     */
    public int getGz() {
        return gz;
    }

    /**
     * @param gz the gz to set
     */
    public void setGz(int gz) {
        this.gz = gz;
    }

    /**
     * @return the izena
     */
    public String getIzena() {
        return izena;
    }

    /**
     * @param izena the izena to set
     */
    public void setIzena(String izena) {
        this.izena = izena;
    }

    /**
     * @return the abizenak
     */
    public String getAbizenak() {
        return abizenak;
    }

    /**
     * @param abizenak the abizenak to set
     */
    public void setAbizenak(String abizenak) {
        this.abizenak = abizenak;
    }

    /**
     * @return the telefonoa
     */
    public int getTelefonoa() {
        return telefonoa;
    }

    /**
     * @param telefonoa the telefonoa to set
     */
    public void setTelefonoa(int telefonoa) {
        this.telefonoa = telefonoa;
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
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;

/**
 *
 * @author Arr1et4
 */
public class Errezeta {
    
    private Gaixoa gaixoa;
    private String prezkripzioa;
    private String diagnostikoa;
    private String aginduak;
    private String iraupena;
    private String posologia;
    private String gomendioak;
    private Date data;
    private String sinadura;

    public Errezeta() {
    }

    public Errezeta(Gaixoa gaixoa, String prezkripzioa, String diagnostikoa, String aginduak, String iraupena, String posologia, String gomendioak, Date data, String sinadura) {
        this.gaixoa = gaixoa;
        this.prezkripzioa = prezkripzioa;
        this.diagnostikoa = diagnostikoa;
        this.aginduak = aginduak;
        this.iraupena = iraupena;
        this.posologia = posologia;
        this.gomendioak = gomendioak;
        this.data = data;
        this.sinadura = sinadura;
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
     * @return the prezkripzioa
     */
    public String getPrezkripzioa() {
        return prezkripzioa;
    }

    /**
     * @param prezkripzioa the prezkripzioa to set
     */
    public void setPrezkripzioa(String prezkripzioa) {
        this.prezkripzioa = prezkripzioa;
    }

    /**
     * @return the diagnostikoa
     */
    public String getDiagnostikoa() {
        return diagnostikoa;
    }

    /**
     * @param diagnostikoa the diagnostikoa to set
     */
    public void setDiagnostikoa(String diagnostikoa) {
        this.diagnostikoa = diagnostikoa;
    }

    /**
     * @return the aginduak
     */
    public String getAginduak() {
        return aginduak;
    }

    /**
     * @param aginduak the aginduak to set
     */
    public void setAginduak(String aginduak) {
        this.aginduak = aginduak;
    }

    /**
     * @return the iraupena
     */
    public String getIraupena() {
        return iraupena;
    }

    /**
     * @param iraupena the iraupena to set
     */
    public void setIraupena(String iraupena) {
        this.iraupena = iraupena;
    }

    /**
     * @return the posologia
     */
    public String getPosologia() {
        return posologia;
    }

    /**
     * @param posologia the posologia to set
     */
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    /**
     * @return the gomendioak
     */
    public String getGomendioak() {
        return gomendioak;
    }

    /**
     * @param gomendioak the gomendioak to set
     */
    public void setGomendioak(String gomendioak) {
        this.gomendioak = gomendioak;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the sinadura
     */
    public String getSinadura() {
        return sinadura;
    }

    /**
     * @param sinadura the sinadura to set
     */
    public void setSinadura(String sinadura) {
        this.sinadura = sinadura;
    }
    
    
}

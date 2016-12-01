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
public class Froga {
    
    private Gaixoa gaixoa;
    private int eskaerazbkia;
    private int historiazbkia;
    private Date eguna;
    private String izena;
    private String tokia;
    private String eginbehar;

    public Froga() {
    }

    public Froga(Gaixoa gaixoa, int eskaerazbkia, int historiazbkia, Date eguna, String izena, String tokia, String eginbehar) {
        this.gaixoa = gaixoa;
        this.eskaerazbkia = eskaerazbkia;
        this.historiazbkia = historiazbkia;
        this.eguna = eguna;
        this.izena = izena;
        this.tokia = tokia;
        this.eginbehar = eginbehar;
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
     * @return the eskaerazbkia
     */
    public int getEskaerazbkia() {
        return eskaerazbkia;
    }

    /**
     * @param eskaerazbkia the eskaerazbkia to set
     */
    public void setEskaerazbkia(int eskaerazbkia) {
        this.eskaerazbkia = eskaerazbkia;
    }

    /**
     * @return the historiazbkia
     */
    public int getHistoriazbkia() {
        return historiazbkia;
    }

    /**
     * @param historiazbkia the historiazbkia to set
     */
    public void setHistoriazbkia(int historiazbkia) {
        this.historiazbkia = historiazbkia;
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
     * @return the tokia
     */
    public String getTokia() {
        return tokia;
    }

    /**
     * @param tokia the tokia to set
     */
    public void setTokia(String tokia) {
        this.tokia = tokia;
    }

    /**
     * @return the eginbehar
     */
    public String getEginbehar() {
        return eginbehar;
    }

    /**
     * @param eginbehar the eginbehar to set
     */
    public void setEginbehar(String eginbehar) {
        this.eginbehar = eginbehar;
    }
    
    
}

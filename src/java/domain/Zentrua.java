/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author Arr1et4
 */
public class Zentrua {
    
    private int id;
    private String izena;
    private String hiria;
    private int telefonoa;
    private ArrayList<Froga> frogak = new ArrayList<Froga>();

    public Zentrua() {
    }

    public Zentrua(int id, String izena, String hiria, int telefonoa) {
        this.id = id;
        this.izena = izena;
        this.hiria = hiria;
        this.telefonoa = telefonoa;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the hiria
     */
    public String getHiria() {
        return hiria;
    }

    /**
     * @param hiria the hiria to set
     */
    public void setHiria(String hiria) {
        this.hiria = hiria;
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
     * @return the frogak
     */
    public ArrayList<Froga> getFrogak() {
        return frogak;
    }

    /**
     * @param frogak the frogak to set
     */
    public void setFrogak(ArrayList<Froga> frogak) {
        this.frogak = frogak;
    }
    
    
}

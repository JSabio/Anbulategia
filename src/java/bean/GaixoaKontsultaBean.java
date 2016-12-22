/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.Gaixoa;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import view.GaixoaDB;

/**
 *
 * @author Eneko
 */
@Named(value = "gaixoaKontsultaBean")
@ManagedBean
@SessionScoped
public class GaixoaKontsultaBean {

    @ManagedProperty("#{gaixoaDB}")
    private GaixoaDB db;
    private Gaixoa gaixoa;
    private int gz;
    private String izena;
    private String abizena;
    private int telefonoa;
    private String helbidea;
    
    @PostConstruct
    public void init() {
        gaixoa = db.getGaixoak().get(0);
        this.gz = gaixoa.getGz();
        this.izena = gaixoa.getIzena();
        this.abizena = gaixoa.getAbizena();
        this.telefonoa = gaixoa.getTelefonoa();
        this.helbidea = gaixoa.getHelbidea();
    }
    
    public void eguneratu(){
        if(!gaixoa.getIzena().equals(izena)) gaixoa.setIzena(izena);
        if(!gaixoa.getAbizena().equals(abizena)) gaixoa.setAbizena(abizena);
        if(gaixoa.getTelefonoa() != telefonoa) gaixoa.setTelefonoa(telefonoa);
        if(!gaixoa.getHelbidea().equals(helbidea)) gaixoa.setHelbidea(helbidea);        
    }

    /**
     * @return the db
     */
    public GaixoaDB getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(GaixoaDB db) {
        this.db = db;
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
     * @return the abizena
     */
    public String getAbizena() {
        return abizena;
    }

    /**
     * @param abizena the abizena to set
     */
    public void setAbizena(String abizena) {
        this.abizena = abizena;
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

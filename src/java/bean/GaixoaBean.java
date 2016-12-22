/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Arr1et4
 */
@ManagedBean
@SessionScoped
public class GaixoaBean {

    private int gz;
    private String izena; 
    private String abizena; 
    private int telefonoa; 
    private String helbidea;
    private boolean pentsioduna;
    private Gaixoa gaixoa;

    public GaixoaBean(){
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

    /**
     * @return the pentsioduna
     */
    public boolean isPentsioduna() {
        return pentsioduna;
    }

    /**
     * @param pentsioduna the pentsioduna to set
     */
    public void setPentsioduna(boolean pentsioduna) {
        this.pentsioduna = pentsioduna;
    }

    public String gaixoberria() {
        //gaixoa = new Gaixoa(gz,izena,abizena,telefonoa,helbidea);
        //gaixoaDAO.gorde(gaixoa);
        gz = 0;
        izena = null;
        abizena = null;
        telefonoa = 0;
        helbidea = null;
        return "idazkari-menua?faces-redirect=true";
    }

}
   
    
   


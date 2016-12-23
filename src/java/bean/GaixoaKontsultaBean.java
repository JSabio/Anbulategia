/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import util.DAOFactory;

/**
 *
 * @author Eneko
 */
@Named(value = "gaixoaKontsultaBean")
@ManagedBean
@ViewScoped
public class GaixoaKontsultaBean {


    private Gaixoa gaixoa;
    private int gz;
    private String izena;
    private String abizena;
    private int telefonoa;
    private String helbidea;
    
    @ManagedProperty(value = "#{langileakBean.sendagilea}")
    private Langilea sendagilea;
    @ManagedProperty(value = "#{langileakBean.erizaina}")
    private Langilea erizaina;
    
    // Tentsioa hartu
    private Integer altua;
    private Integer baxua;
    private Tentsioa tentsioa;
    
    @PostConstruct
    public void init() {       
        String urlGZ = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("gz");
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        gaixoa = gaixoaDAO.getGaixoaGZ(Integer.parseInt(urlGZ));
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
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        gaixoaDAO.editatu(gaixoa);
    }

    public String tentsioaHartu(){
        tentsioa = new Tentsioa();
        tentsioa.setGaixoa(gaixoa);
        tentsioa.setAltua(altua);
        tentsioa.setBaxua(baxua);
        tentsioa.setEguna(new Date());
        TentsioaDAO tentsioaDAO = DAOFactory.tentsioaDAOSortu();
        tentsioaDAO.gorde(tentsioa);
        return "erizain-kontsultak?faces-redirect=true";
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

    /**
     * @return the sendagilea
     */
    public Langilea getSendagilea() {
        return sendagilea;
    }

    /**
     * @param sendagilea the sendagilea to set
     */
    public void setSendagilea(Langilea sendagilea) {
        this.sendagilea = sendagilea;
    }

    /**
     * @return the erizaina
     */
    public Langilea getErizaina() {
        return erizaina;
    }

    /**
     * @param erizaina the erizaina to set
     */
    public void setErizaina(Langilea erizaina) {
        this.erizaina = erizaina;
    }

    /**
     * @return the altua
     */
    public Integer getAltua() {
        return altua;
    }

    /**
     * @param altua the altua to set
     */
    public void setAltua(Integer altua) {
        this.altua = altua;
    }

    /**
     * @return the baxua
     */
    public Integer getBaxua() {
        return baxua;
    }

    /**
     * @param baxua the baxua to set
     */
    public void setBaxua(Integer baxua) {
        this.baxua = baxua;
    }

    /**
     * @return the tentsioa
     */
    public Tentsioa getTentsioa() {
        return tentsioa;
    }

    /**
     * @param tentsioa the tentsioa to set
     */
    public void setTentsioa(Tentsioa tentsioa) {
        this.tentsioa = tentsioa;
    }
    
    
    
    
}

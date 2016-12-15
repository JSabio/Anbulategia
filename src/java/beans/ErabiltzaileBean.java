/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import domain.*;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Arr1et4
 */
@ManagedBean
@SessionScoped
public class ErabiltzaileBean {

    private Langilea langilea = new Langilea("proba","proba");
    private String erabiltzailea;
    private String pasahitza;


    public ErabiltzaileBean(){
    }

    /**
     * @return the langilea
     */
    public Langilea getLangilea() {
        return langilea;
    }

    /**
     * @param langilea the langilea to set
     */
    public void setLangilea(Langilea langilea) {
        this.langilea = langilea;
    }

    /**
     * @return the erabiltzailea
     */
    public String getErabiltzailea() {
        return erabiltzailea;
    }

    /**
     * @param erabiltzailea the erabiltzailea to set
     */
    public void setErabiltzailea(String erabiltzailea) {
        this.erabiltzailea = erabiltzailea;
    }

    /**
     * @return the pasahitza
     */
    public String getPasahitza() {
        return pasahitza;
    }

    /**
     * @param pasahitza the pasahitza to set
     */
    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }
    
    public String login() {
        if(langilea.getErabiltzailea().compareTo(this.erabiltzailea)==0 && langilea.getPasahitza().compareTo(this.pasahitza)==0) {
            return "idazkari-menua";
        }else{
            FacesContext context = FacesContext.getCurrentInstance(); 
            FacesMessage message = new FacesMessage("Erabiltzaile eta/edo pasahitz desegokia"); 
            context.addMessage("loginForm", message); 
            return "error";
        }
    }
}
   
    
   


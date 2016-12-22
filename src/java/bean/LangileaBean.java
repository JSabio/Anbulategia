/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import util.DAOFactory;

/**
 *
 * @author Arr1et4
 */
@ManagedBean
@SessionScoped
public class LangileaBean {

    private Langilea langilea = new Langilea();
    private String erabiltzailea;
    private String pasahitza;

    public LangileaBean() {
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
        LangileaDAO langileaDAO = DAOFactory.langileaDAOSortu();
        if(langileaDAO.egiaztatu(erabiltzailea, pasahitza)){
            langilea = langileaDAO.getLangilea(erabiltzailea);
            if(langilea.getMota().equals("Idazkaria"))
                return "idazkari-menua?faces-redirect=true";
            if(langilea.getMota().equals("Sendagilea")){
                if(langilea.getEspIzena().equals("Orokorra"))
                    return "sendagile-kontsultak?faces-redirect=true";
                else
                    return "espezialista-kontsultak?faces-redirect=true";
            }
            if(langilea.getMota().equals("Erizaina"))
                return "erizain-kontsultak?faces-redirect=true";
        } else{
            FacesContext context = FacesContext.getCurrentInstance(); 
            FacesMessage message = new FacesMessage("Erabiltzaile eta/edo pasahitz desegokia."); 
            context.addMessage("loginForm", message); 
            return "error";
        }
        return null;
    }

    public String logout() {
        this.setErabiltzailea(null);
        this.setPasahitza(null);
        this.setLangilea(null);
        LangileaDAO langileaDAO = DAOFactory.langileaDAOSortu();
        langileaDAO.logout();
        return "login?faces-redirect=true";
    }
    
}

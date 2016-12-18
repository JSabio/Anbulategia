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
import util.DAOFactory;

/**
 *
 * @author Arr1et4
 */
@ManagedBean
@SessionScoped
public class LangileaBean {

    private Langilea langilea;
    private String erabiltzailea;
    private String pasahitza;


    public LangileaBean(){
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
       List<Langilea> langileak = langileaDAO.listaratu();
       
        for (Langilea langilea1 : langileak) {
            if(langilea1.getErabiltzailea().compareTo(this.erabiltzailea)==0 && langilea1.getPasahitza().compareTo(this.pasahitza)==0){
                if(langilea1 instanceof Idazkaria){
                    return "idazkari-menua?faces-redirect=true";
                }
                if(langilea1 instanceof Erizaina){
                    return "erizain-kontsultak?faces-redirect=true";
                }
                if(langilea1 instanceof Sendagilea){
                    return "sendagile-kontsultak?faces-redirect=true";
                }
                if(langilea1 instanceof EspezialitateSendagilea){
                    return "espezialista-kontsultak?faces-redirect=true";
                }
            }
        }
        
        FacesContext context = FacesContext.getCurrentInstance(); 
        FacesMessage message = new FacesMessage("Erabiltzaile eta/edo pasahitz desegokia"); 
        context.addMessage("loginForm", message); 
        return "error";
   
    }
    
    public String saioa_Itxi() throws Throwable{
        this.setErabiltzailea(null);
        this.setPasahitza(null);
        LangileaDAO langileaDAO = DAOFactory.langileaDAOSortu();
        return langileaDAO.saioaItxi();
    }
    
    public String proba(){
        //return "idazkari-menua?faces-redirect=true";
        FacesContext context = FacesContext.getCurrentInstance(); 
        FacesMessage message = new FacesMessage("Erabiltzaile eta/edo pasahitz desegokia"); 
        context.addMessage("loginForm", message); 
        return "error";
    }
}
   
    
   


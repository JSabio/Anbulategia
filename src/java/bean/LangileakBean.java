/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import view.*;
import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Eneko
 */
@ManagedBean
@ViewScoped
public class LangileakBean implements Serializable {

    private Langilea sendagilea;
    private Langilea erizaina;
    private List<Langilea> sendagileak;
    private List<Langilea> erizainak;
    

    @PostConstruct
    public void init() {
        sendagileak = new ArrayList<Langilea>();
        erizainak = new ArrayList<Langilea>();
        List<Langilea> langileak = LangileaConverter.langileak;
        for(Langilea l : langileak){
            if(l.getMota().equals("Sendagilea"))
                sendagileak.add(l);
            if(l.getMota().equals("Erizaina"))
                erizainak.add(l);
        }
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
     * @return the sendagileak
     */
    public List<Langilea> getSendagileak() {
        return sendagileak;
    }

    /**
     * @param sendagileak the sendagileak to set
     */
    public void setSendagileak(List<Langilea> sendagileak) {
        this.sendagileak = sendagileak;
    }

    /**
     * @return the erizainak
     */
    public List<Langilea> getErizainak() {
        return erizainak;
    }

    /**
     * @param erizainak the erizainak to set
     */
    public void setErizainak(List<Langilea> erizainak) {
        this.erizainak = erizainak;
    }
    
}

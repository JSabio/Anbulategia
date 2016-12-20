/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.*;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Eneko
 */
@ManagedBean
@ViewScoped
public class SendagileakDropdownView implements Serializable {

    private Sendagilea sendagilea;
    private List<Sendagilea> sendagileak;
    

    @PostConstruct
    public void init() {
        sendagileak = SendagileaConverter.sendagileak;
    }
    

    /**
     * @return the sendagilea
     */
    public Sendagilea getSendagilea() {
        return sendagilea;
    }

    /**
     * @param sendagilea the sendagilea to set
     */
    public void setSendagilea(Sendagilea sendagilea) {
        this.sendagilea = sendagilea;
    }

    /**
     * @return the sendagileak
     */
    public List<Sendagilea> getSendagileak() {
        return sendagileak;
    }

    /**
     * @param sendagileak the sendagileak to set
     */
    public void setSendagileak(List<Sendagilea> sendagileak) {
        this.sendagileak = sendagileak;
    }
}

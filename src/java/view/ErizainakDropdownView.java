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
public class ErizainakDropdownView implements Serializable {

    private Erizaina erizaina;
    private List<Erizaina> erizainak;
    

    @PostConstruct
    public void init() {
        erizainak = ErizainaConverter.erizainak;
    }
    

    /**
     * @return the erizaina
     */
    public Erizaina getErizaina() {
        return erizaina;
    }

    /**
     * @param erizaina the erizaina to set
     */
    public void setErizaina(Erizaina erizaina) {
        this.erizaina = erizaina;
    }

    /**
     * @return the erizainak
     */
    public List<Erizaina> getErizainak() {
        return erizainak;
    }

    /**
     * @param erizainak the erizainak to set
     */
    public void setErizainak(List<Erizaina> erizainak) {
        this.erizainak = erizainak;
    }
}

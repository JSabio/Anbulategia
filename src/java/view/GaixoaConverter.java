/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.*;

import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;

/**
 *
 * @author Eneko
 */
@FacesConverter(forClass = domain.Gaixoa.class, value = "gaixoaConverter")
public class GaixoaConverter implements Converter {

    @ManagedProperty("#{gaixoaDB}")
    private GaixoaDB db;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            int gz = Integer.parseInt(value);
            for (Gaixoa g : db.getGaixoak()) {
                if (g.getGz() == gz) {
                    return g;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value == null || value.equals("")){
            return "";
        } else{
            return String.valueOf(((Gaixoa) value).getGz());
        }
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

}

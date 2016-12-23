/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import java.util.*;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.FacesConverter;
import javax.faces.convert.Converter;
import util.DAOFactory;

/**
 *
 * @author Eneko
 */
@FacesConverter(forClass = domain.Gaixoa.class, value = "gaixoaConverter")
public class GaixoaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        List<Gaixoa> gaixoak = gaixoaDAO.listaratu();
        if (value.trim().equals("")) {
            return null;
        } else {
            int gz = Integer.parseInt(value);
            for (Gaixoa g : gaixoak) {
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

}

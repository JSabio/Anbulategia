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
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import util.DAOFactory;

/**
 *
 * @author Eneko
 */
@FacesConverter(forClass = domain.Langilea.class,value="langileaConverter")
public class LangileaConverter implements Converter {

    public static List<Langilea> langileak = new ArrayList<Langilea>();

    static {
        
        LangileaDAO langileaDAO = DAOFactory.langileaDAOSortu();
        langileak = langileaDAO.listaratu();
        
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            int gz = Integer.parseInt(value);
            for (Langilea s : langileak) {
                if (s.getGz() == gz) {
                    return s;
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
            return String.valueOf(((Langilea) value).getGz());
        }
    }

}

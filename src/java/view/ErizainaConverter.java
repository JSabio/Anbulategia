/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Eneko
 */
@FacesConverter(forClass = domain.Erizaina.class,value="erizaina")
public class ErizainaConverter implements Converter {

    public static List<Erizaina> erizainak;

    static {
        erizainak = new ArrayList<Erizaina>();

        Erizaina erizaina = new Erizaina();
        erizaina.setGz(101);
        erizaina.setIzena("EA");
        erizaina.setAbizenak("EAA");
        
        ErizainKontsulta kontsulta = new ErizainKontsulta();
        Gaixoa gaixoa = new Gaixoa(); gaixoa.setGz(501); gaixoa.setIzena("EG1"); gaixoa.setAbizenak("EGG1");
        kontsulta.setGaixoa(gaixoa); kontsulta.setMota("Froga");
        erizaina.getKontsultak().add(kontsulta);
        
        erizainak.add(erizaina);
        
        erizaina = new Erizaina();
        erizaina.setGz(201);
        erizaina.setIzena("EB");
        erizaina.setAbizenak("EBB");
        
        kontsulta = new ErizainKontsulta();
        gaixoa = new Gaixoa(); gaixoa.setGz(601); gaixoa.setIzena("EG2"); gaixoa.setAbizenak("EGG2");
        kontsulta.setGaixoa(gaixoa); kontsulta.setMota("Tentsioa hartu");
        erizaina.getKontsultak().add(kontsulta);
        
        erizainak.add(erizaina);
        
        
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            int gz = Integer.parseInt(value);
            for (Erizaina s : erizainak) {
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
            return String.valueOf(((Erizaina) value).getGz());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.*;
import java.util.*;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Eneko
 */
@FacesConverter(forClass = domain.Langilea.class,value="langileaConverter")
public class LangileaConverter implements Converter {

    public static List<Langilea> langileak;

    static {
        langileak = new ArrayList<Langilea>();

        Langilea langilea = new Langilea();
        langilea.setGz(100);
        langilea.setIzena("A");
        langilea.setAbizena("AA");
        langilea.setMota("Sendagilea");
        
        Kontsulta kontsulta = new Kontsulta();
        Gaixoa gaixoa = new Gaixoa(); gaixoa.setGz(500); gaixoa.setIzena("G1"); gaixoa.setAbizena("GG1");
        kontsulta.setGaixoa(gaixoa); kontsulta.setLangilea(langilea);
        langilea.getKontsultak().add(kontsulta);
        
        langileak.add(langilea);
        
        langilea = new Langilea();
        langilea.setGz(200);
        langilea.setIzena("B");
        langilea.setAbizena("BB");
        langilea.setMota("Sendagilea");
        
        kontsulta = new Kontsulta();
        gaixoa = new Gaixoa(); gaixoa.setGz(600); gaixoa.setIzena("G2"); gaixoa.setAbizena("GG2");
        kontsulta.setGaixoa(gaixoa); kontsulta.setLangilea(langilea);
        langilea.getKontsultak().add(kontsulta);
        
        langileak.add(langilea);
        
        langilea = new Langilea();
        langilea.setGz(101);
        langilea.setIzena("EA");
        langilea.setAbizena("EAA");
        langilea.setMota("Erizaina");
        
        kontsulta = new Kontsulta();
        gaixoa = new Gaixoa(); gaixoa.setGz(501); gaixoa.setIzena("EG1"); gaixoa.setAbizena("EGG1");
        kontsulta.setGaixoa(gaixoa); kontsulta.setLangilea(langilea);
        langilea.getKontsultak().add(kontsulta);
        
        langileak.add(langilea);
        
        langilea = new Langilea();
        langilea.setGz(201);
        langilea.setIzena("EB");
        langilea.setAbizena("EBB");
        langilea.setMota("Erizaina");
        
        kontsulta = new Kontsulta();
        gaixoa = new Gaixoa(); gaixoa.setGz(601); gaixoa.setIzena("EG2"); gaixoa.setAbizena("EGG2");
        kontsulta.setGaixoa(gaixoa); kontsulta.setLangilea(langilea);
        langilea.getKontsultak().add(kontsulta);
        
        langileak.add(langilea);
        
        
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

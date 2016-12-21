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
@FacesConverter(forClass = domain.Sendagilea.class,value="sendagileaConverter")
public class SendagileaConverter implements Converter {

    public static List<Sendagilea> sendagileak;

    static {
        sendagileak = new ArrayList<Sendagilea>();

        Sendagilea sendagilea = new Sendagilea();
        sendagilea.setGz(100);
        sendagilea.setIzena("A");
        sendagilea.setAbizenak("AA");
        
        SendagileKontsulta kontsulta = new SendagileKontsulta();
        Gaixoa gaixoa = new Gaixoa(); gaixoa.setGz(500); gaixoa.setIzena("G1"); gaixoa.setAbizenak("GG1");
        kontsulta.setGaixoa(gaixoa);
        sendagilea.getKontsultak().add(kontsulta);
        
        sendagileak.add(sendagilea);
        
        sendagilea = new Sendagilea();
        sendagilea.setGz(200);
        sendagilea.setIzena("B");
        sendagilea.setAbizenak("BB");
        
        kontsulta = new SendagileKontsulta();
        gaixoa = new Gaixoa(); gaixoa.setGz(600); gaixoa.setIzena("G2"); gaixoa.setAbizenak("GG2");
        kontsulta.setGaixoa(gaixoa);
        sendagilea.getKontsultak().add(kontsulta);
        
        sendagileak.add(sendagilea);
        
        
    }

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.trim().equals("")) {
            return null;
        } else {
            int gz = Integer.parseInt(value);
            for (Sendagilea s : sendagileak) {
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
            return String.valueOf(((Sendagilea) value).getGz());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.*;
import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Eneko
 */
@ManagedBean
@SessionScoped
public class GaixoaDB {
    private List<Gaixoa> gaixoak = new ArrayList<Gaixoa>();
    
    public GaixoaDB(){
        
        Gaixoa gaixoa = new Gaixoa();
        gaixoa.setGz(5000);
        gaixoa.setIzena("Gaixoa5000");
        gaixoa.setAbizenak("Abizenak5000");
        gaixoa.setHelbidea("Helbidea5000");
        gaixoak.add(gaixoa);
        
        gaixoa = new Gaixoa();
        gaixoa.setGz(5001);
        gaixoa.setIzena("Gaixoa5001");
        gaixoa.setAbizenak("Abizenak5001");
        gaixoak.add(gaixoa);
        
        gaixoa = new Gaixoa();
        gaixoa.setGz(5002);
        gaixoa.setIzena("Gaixoa5002");
        gaixoa.setAbizenak("Abizenak5002");
        gaixoak.add(gaixoa);
        
        gaixoa = new Gaixoa();
        gaixoa.setGz(5003);
        gaixoa.setIzena("Gaixoa5003");
        gaixoa.setAbizenak("Abizenak5003");
        gaixoak.add(gaixoa);
        
    }

    public List<Gaixoa> query(String gz){
        List<Gaixoa> emaitza = new ArrayList<Gaixoa>();
        for(Gaixoa g : this.gaixoak){
            if(String.valueOf(g.getGz()).startsWith(String.valueOf(gz))){
                emaitza.add(g);
            }
        }
        return emaitza;
    }
    
    
    /**
     * @return the gaixoak
     */
    public List<Gaixoa> getGaixoak() {
        return gaixoak;
    }

    /**
     * @param gaixoak the gaixoak to set
     */
    public void setGaixoak(List<Gaixoa> gaixoak) {
        this.gaixoak = gaixoak;
    }
}

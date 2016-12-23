/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import util.DAOFactory;

/**
 *
 * @author Eneko
 */
@ManagedBean
@SessionScoped
public class GaixoaDB {
    private List<Gaixoa> gaixoak;
    
    public GaixoaDB(){
        
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        gaixoak = gaixoaDAO.listaratu();
        
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

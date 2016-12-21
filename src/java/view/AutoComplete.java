/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import domain.*;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Eneko
 */
@ManagedBean
@SessionScoped
public class AutoComplete {
    
    @ManagedProperty("#{gaixoaDB}")
    private GaixoaDB db;
    private Gaixoa gaixoa;
    
    public AutoComplete(){
        
    }
    
    public List<Gaixoa> complete(String query){
        return db.query(query);
    }

    /**
     * @return the gaixoa
     */
    public Gaixoa getGaixoa() {
        return gaixoa;
    }

    /**
     * @param gaixoa the gaixoa to set
     */
    public void setGaixoa(Gaixoa gaixoa) {
        this.gaixoa = gaixoa;
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

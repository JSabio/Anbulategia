/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Eneko
 */
public interface LangileaDAO {
    
    public void gorde(Langilea langilea);
    public void ezabatu(Langilea langilea);
    public void editatu(Langilea langilea);
    public boolean egiaztatu(String erabiltzailea, String pasahitza);
    public Langilea getLangilea(String erabiltzailea);
    public List<Langilea> listaratu();
    public void logout();
    
}

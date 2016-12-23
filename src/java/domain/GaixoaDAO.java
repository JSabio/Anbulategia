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
public interface GaixoaDAO {
    
    public void gorde(Gaixoa gaixoa);
    public void ezabatu(Gaixoa gaixoa);
    public void editatu(Gaixoa gaixoa);
    public boolean dago(String gz);
    public List<Gaixoa> listaratu();
    public Gaixoa getGaixoaGZ(int gz);
    
}

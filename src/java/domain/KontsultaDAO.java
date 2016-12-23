/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Eneko
 */
public interface KontsultaDAO {
    
    public void gorde(Kontsulta kontsulta);
    public void ezabatu(Kontsulta kontsulta);
    public void editatu(Kontsulta kontsulta);
    public List<Kontsulta> getKontsultak(Langilea langile);
    public List<Kontsulta> listaratu();
    public int getMaxID();
    
}

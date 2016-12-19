/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Julen
 */
public interface AltaBajaDAO {
    public void gorde(AltaBaja altaBaja);
    public void ezabatu(AltaBaja altaBaja);
    public void editatu(AltaBaja altaBaja);
    public List<AltaBaja> listaratu();
}

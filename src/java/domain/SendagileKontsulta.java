/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Arr1et4
 */
public class SendagileKontsulta {
    
    private Gaixoa gaixoa;
    private LanOrduak lanorduak;

    public SendagileKontsulta() {
    }

    public SendagileKontsulta(Gaixoa gaixoa, LanOrduak lanorduak) {
        this.gaixoa = gaixoa;
        this.lanorduak = lanorduak;
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
     * @return the lanorduak
     */
    public LanOrduak getLanorduak() {
        return lanorduak;
    }

    /**
     * @param lanorduak the lanorduak to set
     */
    public void setLanorduak(LanOrduak lanorduak) {
        this.lanorduak = lanorduak;
    }
    
    
    
}

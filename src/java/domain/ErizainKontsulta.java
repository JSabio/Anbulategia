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
public class ErizainKontsulta {
    
    private Gaixoa gaixoa;
    private LanOrduak lanorduak;
    private String mota;

    public ErizainKontsulta() {
    }

    public ErizainKontsulta(Gaixoa gaixoa, LanOrduak lanorduak,String mota) {
        this.gaixoa = gaixoa;
        this.lanorduak = lanorduak;
        this.mota = mota;
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

    /**
     * @return the mota
     */
    public String getMota() {
        return mota;
    }

    /**
     * @param mota the mota to set
     */
    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
}

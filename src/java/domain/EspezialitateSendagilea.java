/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author Arr1et4
 */
public class EspezialitateSendagilea extends Sendagilea{
    
    private String espezialitatea;
    private ArrayList<Zentrua> zentruak;

    public EspezialitateSendagilea(){
        this.zentruak= new ArrayList<>();
    }

    public EspezialitateSendagilea(String espezialitatea, ArrayList<Zentrua> zentruak) {
        this.espezialitatea = espezialitatea;
        this.zentruak = zentruak;
    }
    
    /**
     * @return the espezialitatea
     */
    public String getEspezialitatea() {
        return espezialitatea;
    }

    /**
     * @param espezialitatea the espezialitatea to set
     */
    public void setEspezialitatea(String espezialitatea) {
        this.espezialitatea = espezialitatea;
    }

    /**
     * @return the zentruak
     */
    public ArrayList<Zentrua> getZentruak() {
        return zentruak;
    }

    /**
     * @param zentruak the zentruak to set
     */
    public void setZentruak(ArrayList<Zentrua> zentruak) {
        this.zentruak = zentruak;
    }
    
    
    
}

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
public class Erizaina extends Langilea{

    private ArrayList<ErizainKontsulta> kontsultak;
    
    public Erizaina() {
        this.kontsultak = new ArrayList<ErizainKontsulta>();
    }

    public Erizaina(String erabiltzailea, String pasahitza, int gz, String izena, String abizenak, int telefonoa, String helbidea,ArrayList<ErizainKontsulta> kontsultak) {
        super(erabiltzailea, pasahitza, gz, izena, abizenak, telefonoa, helbidea);
        this.kontsultak = kontsultak;
    }
    
      /**
     * @return the kontsultak
     */
    public ArrayList<ErizainKontsulta> getKontsultak() {
        return kontsultak;
    }

    /**
     * @param kontsultak the kontsultak to set
     */
    public void setKontsultak(ArrayList<ErizainKontsulta> kontsultak) {
        this.kontsultak = kontsultak;
    }
}

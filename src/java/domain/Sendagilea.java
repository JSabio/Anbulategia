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
public class Sendagilea extends Langilea{
    
    private ArrayList<Ordutegia> ordutegiak;
    private ArrayList<LarrialdiOrdutegia> larrialdiordutegiak;
    private ArrayList<SendagileKontsulta> kontsultak;
    private ArrayList<Errezeta> errezetak;
    private ArrayList<Larrialdia> larrialdiak;
    private ArrayList<AltaBaja> altabajak;
    private ArrayList<EspezialitateTxostena> espezialitatetxostenak;

    public Sendagilea(){
        super();
        this.ordutegiak = new ArrayList<>();
        this.larrialdiordutegiak = new ArrayList<>();
        this.kontsultak = new ArrayList<>();
        this.errezetak = new ArrayList<>();
        this.larrialdiak = new ArrayList<>();
        this.altabajak = new ArrayList<>();
        this.espezialitatetxostenak = new ArrayList<>();
    }

    public Sendagilea(String erabiltzailea, String pasahitza, int gz, String izena, String abizenak, int telefonoa, String helbidea, ArrayList<Ordutegia> ordutegiak, ArrayList<LarrialdiOrdutegia> larrialdiordutegiak, ArrayList<SendagileKontsulta> kontsultak, ArrayList<Errezeta> errezetak, ArrayList<Larrialdia> larrialdiak, ArrayList<AltaBaja> altabajak, ArrayList<EspezialitateTxostena> espezialitatetxostenak) {
        super(erabiltzailea, pasahitza, gz, izena, abizenak, telefonoa, helbidea);
        this.ordutegiak = ordutegiak;
        this.larrialdiordutegiak = larrialdiordutegiak;
        this.kontsultak = kontsultak;
        this.errezetak = errezetak;
        this.larrialdiak = larrialdiak;
        this.altabajak = altabajak;
        this.espezialitatetxostenak = espezialitatetxostenak;
    }

    /**
     * @return the ordutegiak
     */
    public ArrayList<Ordutegia> getOrdutegiak() {
        return ordutegiak;
    }

    /**
     * @param ordutegiak the ordutegiak to set
     */
    public void setOrdutegiak(ArrayList<Ordutegia> ordutegiak) {
        this.ordutegiak = ordutegiak;
    }

    /**
     * @return the larrialdiordutegiak
     */
    public ArrayList<LarrialdiOrdutegia> getLarrialdiordutegiak() {
        return larrialdiordutegiak;
    }

    /**
     * @param larrialdiordutegiak the larrialdiordutegiak to set
     */
    public void setLarrialdiordutegiak(ArrayList<LarrialdiOrdutegia> larrialdiordutegiak) {
        this.larrialdiordutegiak = larrialdiordutegiak;
    }

    /**
     * @return the kontsultak
     */
    public ArrayList<SendagileKontsulta> getKontsultak() {
        return kontsultak;
    }

    /**
     * @param kontsultak the kontsultak to set
     */
    public void setKontsultak(ArrayList<SendagileKontsulta> kontsultak) {
        this.kontsultak = kontsultak;
    }

    /**
     * @return the errezetak
     */
    public ArrayList<Errezeta> getErrezetak() {
        return errezetak;
    }

    /**
     * @param errezetak the errezetak to set
     */
    public void setErrezetak(ArrayList<Errezeta> errezetak) {
        this.errezetak = errezetak;
    }

    /**
     * @return the larrialdiak
     */
    public ArrayList<Larrialdia> getLarrialdiak() {
        return larrialdiak;
    }

    /**
     * @param larrialdiak the larrialdiak to set
     */
    public void setLarrialdiak(ArrayList<Larrialdia> larrialdiak) {
        this.larrialdiak = larrialdiak;
    }

    /**
     * @return the altabajak
     */
    public ArrayList<AltaBaja> getAltabajak() {
        return altabajak;
    }

    /**
     * @param altabajak the altabajak to set
     */
    public void setAltabajak(ArrayList<AltaBaja> altabajak) {
        this.altabajak = altabajak;
    }

    /**
     * @return the espezialitatetxostenak
     */
    public ArrayList<EspezialitateTxostena> getEspezialitatetxostenak() {
        return espezialitatetxostenak;
    }

    /**
     * @param espezialitatetxostenak the espezialitatetxostenak to set
     */
    public void setEspezialitatetxostenak(ArrayList<EspezialitateTxostena> espezialitatetxostenak) {
        this.espezialitatetxostenak = espezialitatetxostenak;
    }
    
}

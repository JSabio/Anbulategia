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

//public abstract class Langilea extends Pertsona{

public class Langilea extends Pertsona implements java.io.Serializable{
    
    private int gz;
    private String erabiltzailea;
    private String pasahitza;

    public Langilea(){
        super();
    }
    
    public Langilea(String erabiltzailea, String pasahitza){
        super();
        this.erabiltzailea = erabiltzailea;
        this.pasahitza = pasahitza;
    }

    public Langilea(String erabiltzailea, String pasahitza, int gz, String izena, String abizenak, int telefonoa, String helbidea) {
        super(gz, izena, abizenak, telefonoa, helbidea);
        this.erabiltzailea = erabiltzailea;
        this.pasahitza = pasahitza;
    }
    
    /**
     * @return the erabiltzailea
     */
    public String getErabiltzailea() {
        return erabiltzailea;
    }

    /**
     * @param erabiltzailea the erabiltzailea to set
     */
    public void setErabiltzailea(String erabiltzailea) {
        this.erabiltzailea = erabiltzailea;
    }

    /**
     * @return the pasahitza
     */
    public String getPasahitza() {
        return pasahitza;
    }

    /**
     * @param pasahitza the pasahitza to set
     */
    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }
    
}

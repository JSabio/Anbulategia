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
public class Gaixoa extends Pertsona{
    
    private boolean pentsioduna;
    private Tentsioa tentsioa;
    private Historiala historiala;

    public Gaixoa() {
        super();
    }

    public Gaixoa(int gz, String izena, String abizenak, int telefonoa, String helbidea){
        super(gz, izena, abizenak, telefonoa, helbidea);
    }
    
    public Gaixoa(int gz, String izena, String abizenak, int telefonoa, String helbidea,boolean pentsioduna, Tentsioa tentsioa, Historiala historiala){
        super(gz, izena, abizenak, telefonoa, helbidea);
        this.pentsioduna = pentsioduna;
        this.tentsioa = tentsioa;
        this.historiala = historiala;
    }

    /**
     * @return the pentsioduna
     */
    public boolean isPentsioduna() {
        return pentsioduna;
    }

    /**
     * @param pentsioduna the pentsioduna to set
     */
    public void setPentsioduna(boolean pentsioduna) {
        this.pentsioduna = pentsioduna;
    }

    /**
     * @return the tentsioa
     */
    public Tentsioa getTentsioa() {
        return tentsioa;
    }

    /**
     * @param tentsioa the tentsioa to set
     */
    public void setTentsioa(Tentsioa tentsioa) {
        this.tentsioa = tentsioa;
    }

    /**
     * @return the historiala
     */
    public Historiala getHistoriala() {
        return historiala;
    }

    /**
     * @param historiala the historiala to set
     */
    public void setHistoriala(Historiala historiala) {
        this.historiala = historiala;
    }
    
}

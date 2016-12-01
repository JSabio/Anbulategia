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
public class EspezialitateTxostena {
    
    private Gaixoa gaixoa;
    private String txostena;

    public EspezialitateTxostena() {
    }

    public EspezialitateTxostena(Gaixoa gaixoa, String txostena) {
        this.gaixoa = gaixoa;
        this.txostena = txostena;
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
     * @return the txostena
     */
    public String getTxostena() {
        return txostena;
    }

    /**
     * @param txostena the txostena to set
     */
    public void setTxostena(String txostena) {
        this.txostena = txostena;
    }
    
    
}

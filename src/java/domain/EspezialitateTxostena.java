package domain;
// Generated 22-dic-2016 13:37:19 by Hibernate Tools 4.3.1



/**
 * EspezialitateTxostena generated by hbm2java
 */
public class EspezialitateTxostena  implements java.io.Serializable {


     private int id;
     private Gaixoa gaixoa;
     private Langilea langilea;
     private String txostena;

    public EspezialitateTxostena() {
    }

	
    public EspezialitateTxostena(int id, Gaixoa gaixoa, Langilea langilea) {
        this.id = id;
        this.gaixoa = gaixoa;
        this.langilea = langilea;
    }
    public EspezialitateTxostena(int id, Gaixoa gaixoa, Langilea langilea, String txostena) {
       this.id = id;
       this.gaixoa = gaixoa;
       this.langilea = langilea;
       this.txostena = txostena;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Gaixoa getGaixoa() {
        return this.gaixoa;
    }
    
    public void setGaixoa(Gaixoa gaixoa) {
        this.gaixoa = gaixoa;
    }
    public Langilea getLangilea() {
        return this.langilea;
    }
    
    public void setLangilea(Langilea langilea) {
        this.langilea = langilea;
    }
    public String getTxostena() {
        return this.txostena;
    }
    
    public void setTxostena(String txostena) {
        this.txostena = txostena;
    }




}



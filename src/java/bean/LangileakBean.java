/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import domain.*;
import java.io.Serializable;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import util.DAOFactory;

/**
 *
 * @author Eneko
 */
@ManagedBean
@ViewScoped
public class LangileakBean implements Serializable {

    @ManagedProperty(value = "#{langileaBean.langilea}")
    private Langilea langilea; //identifikaturik dagoen langilea

    private Langilea sendagilea = new Langilea();
    private Langilea erizaina = new Langilea();
    private List<Langilea> sendagileak;
    private List<Langilea> erizainak;
    private List<Kontsulta> sendagileKontsultak;
    private List<Kontsulta> erizainKontsultak;
    private Date sendagileKEguna;
    private Date erizainKEguna;
    
    @ManagedProperty("#{gaixoaDB}")
    private GaixoaDB db;
    private Gaixoa gaixoa;
    private int id;
    private Date eguna;
    private Integer ordua;

    @PostConstruct
    public void init() {
        if (langilea.getMota().equals("Sendagilea")) {
            sendagilea = langilea;
            sendagileKontsultak = null; 
            sendagileKEguna = null;
        } else if (langilea.getMota().equals("Erizaina")) {
            erizaina = langilea;
            sendagileKontsultak = null; 
            erizainKEguna = null;
        } else if (langilea.getMota().equals("Idazkaria")) {
            sendagileak = new ArrayList<Langilea>();
            erizainak = new ArrayList<Langilea>();
            List<Langilea> langileak = LangileaConverter.langileak;
            for (Langilea l : langileak) {
                if (l.getMota().equals("Sendagilea")) {
                    sendagileak.add(l);
                }
                if (l.getMota().equals("Erizaina")) {
                    erizainak.add(l);
                }
            }
        }
    }

    public void sendagileKontsultakHartu() {
        KontsultaDAO kontsultaDAO = DAOFactory.kontsultaDAOSortu();
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        sendagileKontsultak = kontsultaDAO.getKontsultak(sendagilea);
        for (Kontsulta k : sendagileKontsultak) {
            k.setGaixoa(gaixoaDAO.getGaixoaGZ(k.getGaixoa().getGz()));
        }
    }

    public void sendagileKontsultakAzaldu() {
        sendagileKontsultakHartu();
        if (sendagileKEguna != null) {
            ArrayList<Kontsulta> egunekoak = new ArrayList<Kontsulta>();
            for (Kontsulta kontsulta : sendagileKontsultak) {
                if (kontsulta.getEguna().compareTo(sendagileKEguna) == 0) {
                    egunekoak.add(kontsulta);
                }
            }
            sendagileKontsultak = egunekoak;
        }
    }

    public void erizainKontsultakHartu() {
        KontsultaDAO kontsultaDAO = DAOFactory.kontsultaDAOSortu();
        GaixoaDAO gaixoaDAO = DAOFactory.gaixoaDAOSortu();
        erizainKontsultak = kontsultaDAO.getKontsultak(erizaina);
        for (Kontsulta k : erizainKontsultak) {
            k.setGaixoa(gaixoaDAO.getGaixoaGZ(k.getGaixoa().getGz()));
        }
    }

    public void erizainKontsultakAzaldu() {
        erizainKontsultakHartu();
        if (erizainKEguna != null) {
            ArrayList<Kontsulta> egunekoak = new ArrayList<Kontsulta>();
            for (Kontsulta kontsulta : erizainKontsultak) {
                if (kontsulta.getEguna().compareTo(erizainKEguna) == 0) {
                    egunekoak.add(kontsulta);
                }
            }
            erizainKontsultak = egunekoak;
        }
    }

    
    
    public List<Gaixoa> complete(String query){
        return db.query(query);
    }
    
    public void sendagileKontsultaBerria(){
        Kontsulta kontsulta = new Kontsulta();
        kontsulta.setLangilea(sendagilea);
        kontsulta.setGaixoa(gaixoa);
        kontsulta.setEguna(eguna);
        kontsulta.setOrdua(ordua);
        KontsultaDAO kontsultaDAO = DAOFactory.kontsultaDAOSortu();
        kontsulta.setId(kontsultaDAO.getMaxID()+1);
        kontsultaDAO.gorde(kontsulta);
    }
    
    public void erizainKontsultaBerria(){
        Kontsulta kontsulta = new Kontsulta();
        kontsulta.setLangilea(erizaina);
        kontsulta.setGaixoa(gaixoa);
        kontsulta.setEguna(eguna);
        kontsulta.setOrdua(ordua);
        KontsultaDAO kontsultaDAO = DAOFactory.kontsultaDAOSortu();
        kontsulta.setId(kontsultaDAO.getMaxID()+1);
        kontsultaDAO.gorde(kontsulta);
    }
    
    
    
    /**
     * @return the sendagilea
     */
    public Langilea getSendagilea() {
        return sendagilea;
    }

    /**
     * @param sendagilea the sendagilea to set
     */
    public void setSendagilea(Langilea sendagilea) {
        this.sendagilea = sendagilea;
    }

    /**
     * @return the erizaina
     */
    public Langilea getErizaina() {
        return erizaina;
    }

    /**
     * @param erizaina the erizaina to set
     */
    public void setErizaina(Langilea erizaina) {
        this.erizaina = erizaina;
    }

    /**
     * @return the sendagileak
     */
    public List<Langilea> getSendagileak() {
        return sendagileak;
    }

    /**
     * @param sendagileak the sendagileak to set
     */
    public void setSendagileak(List<Langilea> sendagileak) {
        this.sendagileak = sendagileak;
    }

    /**
     * @return the erizainak
     */
    public List<Langilea> getErizainak() {
        return erizainak;
    }

    /**
     * @param erizainak the erizainak to set
     */
    public void setErizainak(List<Langilea> erizainak) {
        this.erizainak = erizainak;
    }

    /**
     * @return the sendagileKontsultak
     */
    public List<Kontsulta> getSendagileKontsultak() {
        return sendagileKontsultak;
    }

    /**
     * @param sendagileKontsultak the sendagileKontsultak to set
     */
    public void setSendagileKontsultak(List<Kontsulta> sendagileKontsultak) {
        this.sendagileKontsultak = sendagileKontsultak;
    }

    /**
     * @return the erizainKontsultak
     */
    public List<Kontsulta> getErizainKontsultak() {
        return erizainKontsultak;
    }

    /**
     * @param erizainKontsultak the erizainKontsultak to set
     */
    public void setErizainKontsultak(List<Kontsulta> erizainKontsultak) {
        this.erizainKontsultak = erizainKontsultak;
    }

    /**
     * @return the sendagileKEguna
     */
    public Date getSendagileKEguna() {
        return sendagileKEguna;
    }

    /**
     * @param sendagileKEguna the sendagileKEguna to set
     */
    public void setSendagileKEguna(Date sendagileKEguna) {
        this.sendagileKEguna = sendagileKEguna;
    }

    /**
     * @return the erizainKEguna
     */
    public Date getErizainKEguna() {
        return erizainKEguna;
    }

    /**
     * @param erizainKEguna the erizainKEguna to set
     */
    public void setErizainKEguna(Date erizainKEguna) {
        this.erizainKEguna = erizainKEguna;
    }

    /**
     * @return the langilea
     */
    public Langilea getLangilea() {
        return langilea;
    }

    /**
     * @param langilea the langilea to set
     */
    public void setLangilea(Langilea langilea) {
        this.langilea = langilea;
    }

    /**
     * @return the db
     */
    public GaixoaDB getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(GaixoaDB db) {
        this.db = db;
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the eguna
     */
    public Date getEguna() {
        return eguna;
    }

    /**
     * @param eguna the eguna to set
     */
    public void setEguna(Date eguna) {
        this.eguna = eguna;
    }

    /**
     * @return the ordua
     */
    public Integer getOrdua() {
        return ordua;
    }

    /**
     * @param ordua the ordua to set
     */
    public void setOrdua(Integer ordua) {
        this.ordua = ordua;
    }

}

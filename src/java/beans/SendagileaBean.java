/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import domain.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Arr1et4
 */
@ManagedBean
@SessionScoped
public class SendagileaBean {
    
    private Sendagilea sendagilea;

    public SendagileaBean(){
    }
    
    /*
    public List<Sendagilea> listaratu() {
        SendagileaDAO sendagileaDAO = DAOFactory.sendagileaDAOSortu();
        return sendagileaDAO.listaratu();
    }
    */
    
    /*
    public void kontsultakIkusi(int gsz,Date eguna) {
        KontsultaDAO kontsultaDAO = DAOFactory.kontsultaDAOSortu();
        ArrayList<SendagileKontsulta> kontsultak = kontsultaDAO.getKontsultaByGSZEguna(gsz,eguna);
        sendagilea.setKontsultak(kontsultak);
    }
    */
    
   /*
    public void kontsultaGorde(int gsz,int gszgaixoa,Date eguna, Time ordua) {
        KontsultaDAO kontsultaDAO = DAOFactory.kontsultaDAOSortu();
        ArrayList<SendagileKontsulta> kontsultak = kontsultaDAO.getKontsultaByGSZEguna(gsz,eguna);
        sendagilea.setKontsultak(kontsultak);
    }
    */

}
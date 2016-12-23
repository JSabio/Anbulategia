/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domain.*;

/**
 *
 * @author Mendel
 */
public class DAOFactory {

    public static LangileaDAO langileaDAOSortu() {
        LangileaDAOHibernate langileaDAO = new LangileaDAOHibernate();
        return langileaDAO;
    }

    public static GaixoaDAO gaixoaDAOSortu() {
        GaixoaDAOHibernate gaixoaDAO = new GaixoaDAOHibernate();
        return gaixoaDAO;
    }

    public static KontsultaDAO kontsultaDAOSortu() {
        KontsultaDAOHibernate kontsultaDAO = new KontsultaDAOHibernate();
        return kontsultaDAO;
    }

    public static LarrialdiaDAO larrialdiaDAOSortu() {
        LarrialdiaDAOHibernate larrialdiaDAO = new LarrialdiaDAOHibernate();
        return larrialdiaDAO;
    }

    public static AltaBajaDAO altabajaDAOSortu() {
        AltaBajaDAOHibernate altabajaDAO = new AltaBajaDAOHibernate();
        return altabajaDAO;
    }
    
    public static TentsioaDAO tentsioaDAOSortu() {
        TentsioaDAOHibernate tentsioaDAO = new TentsioaDAOHibernate();
        return tentsioaDAO;
    }
    
}

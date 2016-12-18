/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import util.HibernateUtil;
import beans.LangileaBean;
/**
 *
 * @author Julen
 */
public class LangileaDAOHibernate implements LangileaDAO{
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Langilea langilea) {
        try {
                session.beginTransaction();
                session.save(langilea);
                session.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                session.getTransaction().rollback();
            }
    }

    @Override
    public void ezabatu(Langilea langilea) {
        try {
                session.beginTransaction();
                session.delete(langilea);
                session.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                session.getTransaction().rollback();
            }
    }

    @Override
    public void editatu(Langilea langilea) {
        try {
                session.beginTransaction();
                session.update(langilea);
                session.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                session.getTransaction().rollback();
            }
    }

    @Override
    public List<Langilea> listaratu() {
        List<Langilea> langileLista = new ArrayList<Langilea>();
        try{
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Langilea.class);
            langileLista = criteria.list();
            session.getTransaction().commit();
        }catch (Exception ex) {
            Logger.getLogger(LangileaBean.class.getName()).log(Level.SEVERE, " Bidaiak listaratzean errorea");
            session.getTransaction().rollback();
        }
        return langileLista;
    }

    @Override
    public String saioaItxi() {
        session.close();
        return "index";
    }
    
}

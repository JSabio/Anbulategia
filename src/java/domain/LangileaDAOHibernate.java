/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Eneko
 */
public class LangileaDAOHibernate implements LangileaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Langilea langilea) {
        try {
            session.beginTransaction();
            session.save(langilea);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Langilea langilea) {
        try {
            session.beginTransaction();
            session.delete(langilea);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Langilea langilea) {
        try {
            session.beginTransaction();
            session.update(langilea);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public boolean egiaztatu(String erabiltzailea, String pasahitza) {
        try {
            session.beginTransaction();
            String hql = "from Langilea where Erabiltzailea = ? and Pasahitza = ?";
            Query kontsulta = session.createQuery(hql).setParameter(0, erabiltzailea).setParameter(1, pasahitza);
            List<Langilea> lista = kontsulta.list();
            session.getTransaction().commit();
            if (lista.isEmpty()) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Langilea getLangilea(String erabiltzailea){
        try {
            session = this.session.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "from Langilea where Erabiltzailea = ?";
            Query kontsulta = session.createQuery(hql).setParameter(0, erabiltzailea);
            Langilea langilea = (Langilea) kontsulta.uniqueResult();
            session.getTransaction().commit();
            return langilea;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new Langilea();
        }
    }
    
    @Override
    public void logout() {
        session.close();
    }

}

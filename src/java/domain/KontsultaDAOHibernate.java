/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Eneko
 */
public class KontsultaDAOHibernate implements KontsultaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Kontsulta kontsulta) {
        try {
            session = this.session.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(kontsulta);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Kontsulta kontsulta) {
        try {
            session.beginTransaction();
            session.delete(kontsulta);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Kontsulta kontsulta) {
        try {
            session.beginTransaction();
            session.update(kontsulta);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public List<Kontsulta> listaratu() {
        try {
            session.beginTransaction();
            Query kontsulta = session.createQuery("from Kontsulta");
            List<Kontsulta> lista = kontsulta.list();
            session.getTransaction().commit();
            if (lista.isEmpty()) {
                return new ArrayList<Kontsulta>();
            } else {
                return lista;
            }
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new ArrayList<Kontsulta>();
        }
    }

    @Override
    public List<Kontsulta> getKontsultak(Langilea langile) {
        try {
            session.beginTransaction();
            Query kontsulta = session.createQuery("from Kontsulta where LangileaGZ = ?").setParameter(0, langile.getGz());
            List<Kontsulta> lista = kontsulta.list();
            session.getTransaction().commit();
            if (lista.isEmpty()) {
                return new ArrayList<Kontsulta>();
            } else {
                return lista;
            }
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new ArrayList<Kontsulta>();
        }
    }

    @Override
    public int getMaxID() {
        try {
            session.beginTransaction();
            Query kontsulta = session.createQuery("SELECT max(k.id) from Kontsulta as k");
            int max = (int) kontsulta.uniqueResult();
            session.getTransaction().commit();
            return max;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return 0;
        }
    }

}

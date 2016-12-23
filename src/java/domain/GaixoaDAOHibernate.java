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
public class GaixoaDAOHibernate implements GaixoaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Gaixoa gaixoa) {
        try {
            session.beginTransaction();
            session.save(gaixoa);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void ezabatu(Gaixoa gaixoa) {
        try {
            session.beginTransaction();
            session.delete(gaixoa);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void editatu(Gaixoa gaixoa) {
        try {
            session.beginTransaction();
            session.update(gaixoa);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public boolean dago(String gz) {
        try {
            int gsz = Integer.parseInt(gz);
            session.beginTransaction();
            String hql = "from Gaixoa where GZ = ?";
            Query kontsulta = session.createQuery(hql).setParameter(0, gsz);
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
    public List<Gaixoa> listaratu() {
        try {
            session.beginTransaction();
            Query kontsulta = session.createQuery("from Gaixoa");
            List<Gaixoa> lista = kontsulta.list();
            session.getTransaction().commit();
            if (lista.isEmpty()) {
                return new ArrayList<Gaixoa>();
            } else {
                return lista;
            }
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new ArrayList<Gaixoa>();
        }
    }

    @Override
    public Gaixoa getGaixoaGZ(int gz) {
        try {
            session = this.session.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "from Gaixoa where GZ = ?";
            Query kontsulta = session.createQuery(hql).setParameter(0, gz);
            Gaixoa gaixoa = (Gaixoa) kontsulta.uniqueResult();
            session.getTransaction().commit();
            return gaixoa;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new Gaixoa();
        }
    }

}

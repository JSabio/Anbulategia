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

/**
 *
 * @author Julen
 */
public class AltaBajaDAOHibernate implements AltaBajaDAO{
    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(AltaBaja altaBaja) {
        try {
                session.beginTransaction();
                session.save(altaBaja);
                session.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                session.getTransaction().rollback();
            }
    }

    @Override
    public void ezabatu(AltaBaja altaBaja) {
        try {
                session.beginTransaction();
                session.delete(altaBaja);
                session.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                session.getTransaction().rollback();
            }
    }

    @Override
    public void editatu(AltaBaja altaBaja) {
        try {
                session.beginTransaction();
                session.update(altaBaja);
                session.getTransaction().commit();
            } catch (Exception ex) {
                ex.printStackTrace();
                session.getTransaction().rollback();
            }
    }

    @Override
    public List<AltaBaja> listaratu() {
        List<AltaBaja> altaBajaLista = new ArrayList<AltaBaja>();
        try{
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Langilea.class);
            altaBajaLista = criteria.list();
            session.getTransaction().commit();
        }catch (Exception ex) {
            Logger.getLogger(altaBajaBean.class.getName()).log(Level.SEVERE, " Bidaiak listaratzean errorea");
            session.getTransaction().rollback();
        }
        return altaBajaLista;
    }
    
}

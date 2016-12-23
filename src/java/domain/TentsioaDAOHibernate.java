/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Eneko
 */
public class TentsioaDAOHibernate implements TentsioaDAO{

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    
    @Override
    public void gorde(Tentsioa tentsioa) {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(tentsioa);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
    
}

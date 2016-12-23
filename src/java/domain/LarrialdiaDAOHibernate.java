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
 * @author Mikel
 */
public class LarrialdiaDAOHibernate implements LarrialdiaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void gorde(Larrialdia larrialdia) {
        try {
            session.beginTransaction();
            session.save(larrialdia);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }


}

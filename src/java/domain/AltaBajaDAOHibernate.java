/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Mikel
 */
public class AltaBajaDAOHibernate implements AltaBajaDAO {

    private Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    @Override
    public void editatu(AltaBaja altabaja) {
        try {
            session.beginTransaction();
            session.update(altabaja);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }


    @Override
    public AltaBaja getAltaBaja(int gsz){
        try {
            session = this.session.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "from Altabaja where GaixoaGZ = ?";
            Query kontsulta = session.createQuery(hql).setParameter(0, gsz);
            AltaBaja altabaja = (AltaBaja) kontsulta.uniqueResult();
            session.getTransaction().commit();
            return altabaja;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
            return new AltaBaja();
        }
    }
    

}

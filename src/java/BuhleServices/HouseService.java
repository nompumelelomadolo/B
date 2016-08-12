/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import model.House;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author aggie
 */
public class HouseService {
     public boolean AddHouse(House house) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();

        if (isHouseExists(house)) {
            return false;
        }
 Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            session.saveOrUpdate(house);
            tr.commit();
      
        } catch (Exception ex) {
            if(tr != null){
                tr.rollback();
            }
        } finally {
            session.close();
        }
        return true;
    }

    public boolean isHouseExists(House house) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        boolean result = false;
        Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry =session.createQuery("from house where HouseId='"+house.getHouseId()+"'");
            House t = (House)qry.uniqueResult();
            tr.commit();
            if(t!=null){result =true;}
        } catch (Exception ex) {
            if(tr != null){
                tr.rollback();}
        } finally {
            session.close();
        }
        return result;
    }
}

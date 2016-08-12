/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import model.Address;
import model.Room;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author aggie
 */
public class AddressService {
    public boolean AddAddress(Address address) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();

        if (isAddressExists(address)) {
            return false;
        }
 Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            session.saveOrUpdate(address);
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

    public boolean isAddressExists(Address address) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        boolean result = false;
        Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry =session.createQuery("from address where AddressId='"+address.getAddressId()+"'");
            Room t = (Room)qry.uniqueResult();
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

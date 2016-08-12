/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import model.Address;
import model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author aggie
 */
public class EmpRegService {
 public boolean regAddress(Address address) {
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

    public boolean RegisterEmployee(Employee emp, Address address) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();

        if (isTenantExists(emp)) {
            return false;
        }
 Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            session.saveOrUpdate(emp);
            tr.commit();
           regAddress(address);
      
        } catch (Exception ex) {
            if(tr != null){
                tr.rollback();
            }
        } finally {
            session.close();
        }
        return true;
    }

    public boolean isTenantExists(Employee emp) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        boolean result = false;
        Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry =session.createQuery("from employee where EmpId='"+emp.getEmpId()+"'");
            Tenant t = (Tenant)qry.uniqueResult();
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
    
      public boolean isAddressExists(Address address) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        boolean result = false;
        Transaction tr = null;
        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry =session.createQuery("from address where AddressId='"+address.getAddressId()+"'");
            Address a = (Address)qry.uniqueResult();
            tr.commit();
            if(a!=null){result =true;}
        } catch (Exception ex) {
            if(tr != null){
                tr.rollback();}
        } finally {
            session.close();
        }
        return result;
    }
}

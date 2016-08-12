/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import java.util.ArrayList;
import java.util.List;
import model.House;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author aggie
 */
public class Allhouses {
    public List getHouseDetails(){
        List<House> a = new ArrayList<>();
        
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        

        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry = session.createQuery("from House");
            a = qry.list();
            //user = (User)qry.uniqueResult();
            tr.commit();
            System.out.println("testing");
        } catch (Exception e) {
            if (tr != null) {
                tr.rollback();
            }
            System.out.println(e);
        } finally {
            session.close();
        }
        
        return a;
        
    }
    public static void main(String... args){
        Allhouses l = new Allhouses();
        List<House> ls = new ArrayList<>();
        //ls = l.getTenantDetails();
        ls = l.getHouseDetails();
        System.out.println(ls.get(0).getHouseAddress());
    }
}

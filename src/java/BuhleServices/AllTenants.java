/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import java.util.ArrayList;
import java.util.List;
//import javax.xml.registry.infomodel.User;
//import javax.xml.registry.infomodel.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;
import model.Tenant;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

/**
 *
 * @author aggie
 */
public class AllTenants {
    private SessionFactory mySessionFactory;
    
      public List getTenantDetails(){
        List<Tenant> a = new ArrayList<>();
        
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        

        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry = session.createQuery("from Tenant");
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
     public List<Tenant> getListOfUsers(){
        List<Tenant> list = new ArrayList<Tenant>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Tenant where name = 'Ayanda'").list();                       
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
      }
     public Tenant SearchTenant(String mail){
         String message = null;
         Session session = null;
         Tenant ten = null;
       // List<Tenant> list = new ArrayList<Tenant>();
        Transaction tx = null;       
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();

            tx = session.getTransaction();
            tx.begin();
            Query query= session.createQuery("from Tenant where email ='"+ mail+" '");
            ten = (Tenant)query.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return ten;
      }
      public List<Tenant> getAllInfo(int a){
       
           Session session = NewHibernateUtil.getSessionFactory().openSession();
           String sql = "select ten.name,ten.surname,ten.email,roo.RoomId,roo.RoomType,hou.HouseId, con.cotractid"
                   + "from tenant ten, room roo, house hou, contract con"
                   + "where ten.contractid = con.contractid and con.RoomId=roo.RoomId and roo.HouseId=hou.HouseId and ten.email=:email";
            
           Query query= session.createQuery(sql);
           query.setParameter("email", a);
           query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
    
        return query.list();
      }
    public static void main(String... args){
        AllTenants l = new AllTenants();
        List<Tenant> ls = new ArrayList<>();
        //ls = l.getTenantDetails();
        ls = l.getTenantDetails();
        System.out.println(ls.get(0).getName());
    }
}

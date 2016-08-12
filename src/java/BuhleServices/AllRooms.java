/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import java.util.ArrayList;
import java.util.List;
import model.Room;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author aggie
 */
public class AllRooms {
       public List getRoomsDetails(){
        List<Room> a = new ArrayList<>();
        
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        

        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry = session.createQuery("from Room");
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
       public List<Room> getAvailableRooms(){
        List<Room> list = new ArrayList<Room>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Room where RoomStatus = 'Available'").list();                       
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
       public List<Room> getTakenRooms(){
        List<Room> list = new ArrayList<Room>();
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Room where RoomStatus = 'Taken'").list();                       
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
       
    public static void main(String... args){
        AllRooms l = new AllRooms();
        List<Room> ls = new ArrayList<>();
        //ls = l.getTenantDetails();
        ls = l.getRoomsDetails();
        System.out.println(ls.get(0).getRoomStatus());
    }
}

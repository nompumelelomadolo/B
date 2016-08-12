/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleServices;

import model.Employee;
import util.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author aggie
 */
public class LoginService {
    public boolean confirm(String password, String userName) {
        Employee user = getEmployeeByPassword(password);
        if (user != null && user.getPassword().equals(password) && user.getUserName().equals(userName)) {
            return true;
        } else {
            return false;
        }
    }

    public Employee getEmployeeByPassword(String password) {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tr = null;
        Employee user = null;

        try {
            tr = session.getTransaction();
            tr.begin();
            Query qry = session.createQuery("from Employee where password = '" + password+"'");
            user = (Employee)qry.uniqueResult();
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
        return user;
    }
}

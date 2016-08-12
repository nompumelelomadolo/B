/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuhleServices;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aggie
 */
abstract class Student {
abstract void run();
}
class Details extends Student{  
void run(){System.out.println("---------------New Tenant-------------------");}  
}  
class Tenant {

    private String tenantId;
    // private Contract contract;

    private String name;
    private String surname;
    private Character gender;
    private String email;
    private String contactNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getEmail() {
        return email;
    }

    public Character getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTenantId() {
        return tenantId;
    }

    public String toString() {

        return " Tenanat ID: " + tenantId + "\n Tenant Full Name: " + name.concat(surname) + "\n Gender (F=Female and M=Male): " + gender;
    }

}

class Payment extends Tenant {

    private int paymentId;
    private double paymentAmount;
    private String paymentType;

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String toString() {

        return " Payment ID: " + paymentId + "\n Amount: " + paymentAmount;
    }
}
public class TestTenant {

    public static void main(String[] args) {
        Tenant t = new Tenant();
        Payment p = new Payment();
      Details s=new Details();
s.run();
        t.setName("Nompumelelo");
        t.setSurname("Madolo");
        t.setGender('f');
        t.setContactNo("0710201545");
        t.setTenantId("9208020521084");

        p.setPaymentType("card");
        p.setPaymentId(101);
        p.setPaymentAmount(5000);

        System.out.println(t.toString());
        System.out.println(p.toString());

        System.out.println(".............Payment Date and Time..........Date");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuhleSMController;

import BuhleServices.EmpRegService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Address;
import model.Employee;
/**
 *
 * @author aggie
 */
@WebServlet(name = "AdddressServlet", urlPatterns = {"/AdddressServlet"})
public class EmpRegServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int empId = Integer.parseInt(request.getParameter("eid"));
        String EmpName = request.getParameter("fname");
        String EmpSurname = request.getParameter("sname");
        int contact = Integer.parseInt(request.getParameter("con"));
        String EmpType = request.getParameter("eType");
        String UserName = request.getParameter("uname");
        String Password = request.getParameter("pass");
        String email = request.getParameter("mail");
       

       int addressId = Integer.parseInt(request.getParameter("aid"));
        int addressNo = Integer.parseInt(request.getParameter("addNo"));
        String StreetName = request.getParameter("stName");
        String City = request.getParameter("cit");
        String Province = request.getParameter("pro");
        String Country = request.getParameter("cou");
        
        Address add = new Address(addressId,addressNo, StreetName, City, Province, Country);
        Employee emp = new Employee(empId, add, EmpName, EmpSurname, contact, EmpType, UserName, Password, email, null, null, null);
       
        try {

            EmpRegService EmpRegServ = new EmpRegService();
           

            boolean result = EmpRegServ.RegisterEmployee(emp,add);
         

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registered successfully</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");

            if (result) {
                out.println("<h1>Job well done...</h1>");
            } else {
                out.println("<h1>Registration failed</h1>");
                out.println("To try again <a href=Tenants.jsp>Click here</a>");
            }
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

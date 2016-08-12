/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuhleSMController;

import BuhleServices.TenantService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tenant;
import model.Address;

/**
 *
 * @author aggie
 */
@WebServlet(name = "TenantServlet", urlPatterns = {"/TenantServlet"})
public class TenantServlet extends HttpServlet {


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
       
        String TenantId = request.getParameter("tid");
        String name = request.getParameter("fname");
        String surname = request.getParameter("sname");
        char[] gender = (request.getParameter("gend")).toCharArray();
        String email = request.getParameter("mail");
        String contactNo = request.getParameter("cont");
        //register add
        
        int addressId = Integer.parseInt(request.getParameter("addId"));
        int addressNo = Integer.parseInt(request.getParameter("addNo"));
        String StreetName = request.getParameter("stName");
        String City = request.getParameter("cit");
        String Province = request.getParameter("pro");
        String Country = request.getParameter("cou");
   
       Address address = new Address(addressId,addressNo, StreetName, City, Province, Country);
       Tenant tenant = new Tenant(TenantId, null, null, null, address, name, surname, gender[0], email, contactNo, null);


        try {
            TenantService tenantServ = new TenantService();
           // TenantService addressServ = new TenantService();
            
            
 boolean result = tenantServ.RegisterTenant(tenant,address);

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registered successfully</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");

            if (result) {
                out.println("<h1>Job well done...</h1>");
                 out.println("To try again <a href=RoomRe.jsp>Click here</a>");
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

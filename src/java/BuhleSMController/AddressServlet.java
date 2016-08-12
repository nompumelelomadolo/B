/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuhleSMController;

import BuhleServices.AddressService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Address;

/**
 *
 * @author aggie
 */
@WebServlet(name = "AddressServlet", urlPatterns = {"/AddressServlet"})
public class AddressServlet extends HttpServlet {

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
             int addressId = Integer.parseInt(request.getParameter("addId"));
        int addressNo = Integer.parseInt(request.getParameter("addNo"));
        String StreetName = request.getParameter("stName");
        String City = request.getParameter("cit");
        String Province = request.getParameter("pro");
        String Country = request.getParameter("cou");
        Address address = new Address(addressId, addressNo, StreetName, City, Province, Country);
         try {
            AddressService tenantServ = new AddressService();
            
 boolean result = tenantServ.AddAddress(address);

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registered successfully</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");

            if (result) {
               // out.println("<h1>Job well done...</h1>");
                out.println("To add Tenant Personal information <a href=Tenants.jsp>Click here</a>");
            } else {
                out.println("<h1>Registration failed</h1>");
                out.println("To try again <a href=Address.jsp>Click here</a>");
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

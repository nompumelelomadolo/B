<%-- 
    Document   : TenantReport
    Created on : Jul 5, 2016, 11:10:04 PM
    Author     : aggie
--%>
<%@page import="BuhleServices.AllTenants"%>
<%@page import = "model.Tenant" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:lightgrey;">
            <center><img src="logo.png" width="900" height="150"></center>

            <form name = "Searchform" action="SearchTenantServ">
            <p><center>Search with email address</center></p>
        <center><p><input type="text" name = "searchValue" value="" placeholder=""></p></center>
        <p><center><input type="submit" value="Find Tenant Details>>" name="searchButton"/></p></form></center>
        </form>
        <%
            Tenant tnt = (Tenant)request.getAttribute("searchResult");
            if(tnt != null)
            {
            %>
            <center><table>
             <thead>
                 <tr>
                    
                     <th>First Name</th>
                     <th>Last Name</th>
                     <th>Contact</th>
                     <th>email</th>                
                 </tr>
             </thead>
             <tbody>
    
                 <tr>
                     
                     <td><%out.println(tnt.getName());%></td>
                     <td><%out.println(tnt.getSurname());%></td>
                     <td><%out.println(tnt.getContactNo());%></td>
                     <td><%out.println(tnt.getEmail());%></td>
                 </tr>
                 <%}%>
             <tbody>
                </table> </center>
        <%
            String rMessage=request.getParameter("message");
            if(rMessage==null)
                rMessage ="";
            out.println(rMessage);
             
            %>
            <center><td><%out.println("--------------------------------------------------------------------------");%></td></center>
            <center><table>
             <thead>
                 <tr>
                  
           
                     <th>First Name</th>
                     <th>Last Name</th>
                     <th>Contact</th>
                     <th>email</th>                
                 </tr>
             </thead>
             <tbody>
                 <%
                     AllTenants allService = new AllTenants();
                     List<Tenant> list = allService.getTenantDetails();
                     for (Tenant u : list) {
                 %>
                 <tr>
                     
                     <td><%=u.getName()%></td>
                     <td><%=u.getSurname()%></td>
                     <td><%=u.getContactNo()%></td>
                     <td><%=u.getEmail()%></td>
                 </tr>
                 <%}%>
             <tbody>
                </table> </center>  
        <center> <a href = "success.jsp">Back</a></center>
    </body>
</html>

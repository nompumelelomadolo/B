<%-- 
    Document   : HouseRe
    Created on : Jul 8, 2016, 3:23:20 AM
    Author     : aggie
--%>
<%@page import="BuhleServices.Allhouses"%>
<%@page import = "model.House" %>
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
       
        
       
        <%
            Allhouses log = new Allhouses();
            List<House> l = new ArrayList<House>();
            l = log.getHouseDetails();
            
            for(int x = 0; x < l.size(); x++){
                
        %>
       <center> <h1> ..........................</h1></center>
    <center><h3>first name: <%=l.get(x).getHouseAddress()%></h3></center>
       <center> <h3>surname: <%=l.get(x).getNoOfRooms()%></h3></center>
        
        
      
        <%}%>
        <center> <a href = "success.jsp">Back</a></center>
    </body>
</html>

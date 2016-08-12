<%-- 
    Document   : logout
    Created on : Jun 22, 2016, 8:30:18 AM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body><%
    session.removeAttribute("userName");
    session.removeAttribute("password");
    session.invalidate();
    %>
    <center>
        <h1> You have logged out successfully</h1>
        <a href="login.jsp">click here</a>
    </center>
        
    </body>
</html>

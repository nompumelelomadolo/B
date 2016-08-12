<%-- 
    Document   : Tenant
    Created on : Jun 22, 2016, 2:28:04 AM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body style="background-color:lightgrey;">
    <center> <img src="logo.png" width="900" height="150"></center>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Tenant</title>
    </head>
    <form id  ="form" name = "form"  method ="post" action="TenantServlet">
        <p ><center>Tenant ID:<input type="text" name ="tid" id ="tid" value ="" placeholder=""></p></center>
        <p ><center>Name:<input type="text" name ="fname" id ="fname" value ="" placeholder=""></p></center>
           <p><center>Surname<input type="text" name = "sname" id = "sname" value="" placeholder=""></p></center>
           <%-- <p><center>Gender:<input type="text" name = "gend" id = "gend" value="" placeholder=""></p></center>--%>
           
           <center>Gender: <select name="gend">
                   <option name="gend" value=F>Female</option>
                   <option name="gend" value=M>Male</option></select></center>
                    
               
           <p><center>email address:<input type="text" name = "mail" id = "mail" value="" placeholder=""></p></center>
           <p><center>contact no:<input type="text" name = "cont" id = "cont" value="" placeholder="" maxlength="10"></p></center>
           
           <p><center><button type="submit">Register</button></p></form></center>
<center> <a href = "success.jsp">Back</a></center>
    </body>
</html>

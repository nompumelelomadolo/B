<%-- 
    Document   : RegEmp
    Created on : Jul 4, 2016, 11:58:15 PM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:lightgrey;">
            <img src="logo.png" width="128" height="150">
     <form id  ="form" name = "form"  method ="post" action="EmpRegServlet">
        <p ><center>Emp ID:<input type="text" name ="eid" id ="eid" value ="" placeholder=""></p></center>
        <p ><center>Name:<input type="text" name ="fname" id ="fname" value ="" placeholder=""></p></center>
           <p><center>Surname<input type="text" name = "sname" id = "sname" value="" placeholder=""></p></center>
           <p><center>Contact:<input type="text" name = "con" id = "con" value="" placeholder=""></p></center>
           <p ><center>Employee Type:<input type="text" name ="eType" id ="eType" value ="" placeholder=""></p></center>
           <p><center>User Name:<input type="text" name = "uname" id = "uname" value="" placeholder=""></p></center>
           <p><center>Password:<input type="text" name = "pass" id = "pass" value="" placeholder=""></p></center>
           <p><center>email address:<input type="text" name = "mail" id = "mail" value="" placeholder=""></p></center>
           
           <p><center>Address No<input type="text" name = "addNo" id = "addNo" value="" placeholder=""></p></center>
           <p><center>Street Name:<input type="text" name = "stName" id = "stName" value="" placeholder=""></p></center>
           <p ><center>City:<input type="text" name ="cit" id ="cit" value ="" placeholder=""></p></center>
           <p><center>Promise:<input type="text" name = "pro" id = "pro" value="" placeholder=""></p></center>
           <p><center>Country:<input type="text" name = "cou" id = "cou" value="" placeholder=""></p></center>
 
           
           <p><center><button type="submit">Register</button></p></form></center>
<center> <a href = "success.jsp">Back</a></center>
    </body>
</html>

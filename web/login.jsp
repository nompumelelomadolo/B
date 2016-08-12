<%-- 
    Document   : login
    Created on : Jun 23, 2016, 3:20:25 AM
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
       <form id  ="form" name = "form"  method ="post" action="LoginServlet">
        
        <p ><center>User Name:<input type="text" name ="name" id ="name" value ="" placeholder=""></p></center>
           <p><center>Password<input type="password" name = "pass" id = "pass" value="" placeholder=""></p></center>
           
           <p class="remember_me" center>
               <label>
                  <center> <input type="checkbox" name="remember_me" id="remember_me"></center>
                   
               </label>
           </p>
           <p><center><button type="submit">Login</button></p></form></center>
    </body>
</html>

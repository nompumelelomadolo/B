<%-- 
    Document   : Address
    Created on : Jul 9, 2016, 2:33:17 PM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form id  ="form" name = "form"  method ="post" action="AddressServlet">
       <p><center>Address ID<input type="text" name = "addId" id = "addId" value="" placeholder=""></p></center>
            <p><center>Address No<input type="text" name = "addNo" id = "addNo" value="" placeholder=""></p></center>
           <p><center>Street Name:<input type="text" name = "stName" id = "stName" value="" placeholder=""></p></center>
           <p ><center>City:<input type="text" name ="cit" id ="cit" value ="" placeholder=""></p></center>
           <%--<p><center>Province:<input type="text" name = "pro" id = "pro" value="" placeholder=""></p></center>--%>
         <p><center>Province: <select name="pro">
                   <option name="pro" value="Western Cape">Western Cape</option>
                   <option name="pro" value="Mpumalanga">Mpumalanga</option>
               <option name="pro" value="Limpopo">Limpopo</option>
                   <option name="pro" value="FreeSate">FreeState</option>
               <option name="pro" value="Kwazulu Natal">Kwazulu Natal</option>
                   <option name="pro" value="Northern Cape">Northern Cape</option>
               <option name="pro" value="Eastern Cape">Eastern Cape</option>
                <option name="pro" value="North West">North West</option>
               <option name="pro" value="Gauteng">Gauteng</option>
               <option name="pro" value=Other>Other</option></select></p>
           <%-- <p><center>Country:<input type="text" name = "cou" id = "cou" value="" placeholder=""></p></center>--%>
         <p> <center>Gender: <select name="cou">
                   <option name="cou" value=SA>South Africa</option>
                   <option name="cou" value=Other>Other</option></select></center></p>
           
           <p><center><button type="submit">Register</button></p></form></center>
           
    </body>
</html>

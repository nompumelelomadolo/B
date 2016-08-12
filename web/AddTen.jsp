<%-- 
    Document   : AddTen
    Created on : Jul 12, 2016, 1:54:46 AM
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
            <center><img src="logo.png" width="900" height="150"></center>
            
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
           <center> <a href = "success.jsp">Back</a></center>
    </body>
</html>

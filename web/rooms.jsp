<%-- 
    Document   : rooms
    Created on : Jun 29, 2016, 10:50:55 PM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> ROOM Page</title>
    </head>
    <body style="background-color:lightgrey;">
            <img src="logo.png" width="128" height="150">
            
        <form id  ="form" name = "form"  method ="post" action="RoomServlet">
        <p ><center>Room ID:<input type="text" name ="rid" id ="rid" value ="" placeholder=""></p></center>
     
        
        <p><center>Room Type: <select name="rType">
                   <option name="rType" value=Double>Double</option>
                   <option name="rType" value=Single>Single</option></select></center></p>
                   
          <p><center>Room Price<input type="text" name = "rPrice" id = "rPrice" value="" placeholder=""></p></center>
         
         
           <p><center>Room Status: <select name="rStatus">
                   <option name="rStatus" value=Available>Available</option>
                   <option name="rStatus" value=Taken>Taken</option></select></center></p>
                   
                   <p><center>Gender Type: <select name="gType">
                   <option name="gType" value=F>Female</option>
                   <option name="gType" value=M>Male</option></select></center></p>
           <p><center><button type="submit">Add Room</button></p></form></center>
<center> <a href = "success.jsp">Back</a></center>
    </body>
</html>

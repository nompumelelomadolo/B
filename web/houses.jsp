<%-- 
    Document   : houses
    Created on : Jun 30, 2016, 12:52:17 AM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding House Page</title>
    </head>
   <form id  ="form" name = "form"  method ="post" action="HouseServlet">
        <p ><center>House ID:<input type="text" name ="hid" id ="hid" value ="" placeholder=""></p></center>
        <p ><center>House Address:<input type="text" name ="hadd" id ="hadd" value ="" placeholder=""></p></center>
           <p><center>Room Numbers<input type="text" name = "rno" id = "rno" value="" placeholder=""></p></center>
           
           <p><center><button type="submit">Add House</button></p></form></center>
<center> <a href = "success.jsp">Back</a></center>
</html>

<%-- 
    Document   : RoomRe
    Created on : Jul 8, 2016, 3:23:03 AM
    Author     : aggie
--%>
<%@page import="BuhleServices.AllRooms"%>
<%@page import = "model.Room" %>
<%@page import = "java.util.List" %>
<%@page import = "java.util.ArrayList" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body cc
       
            
            
            
        <center><table>
             <thead>
                 <tr>
                    <th>Room ID</th>
                     <th>Room Type</th>
                     <th>Price of the Room p.m</th>
                    <th>Gender</th>
                                   
                 </tr>
             </thead>
             <tbody>
                 <%
                    AllRooms allService = new AllRooms();
                     List<Room> list = allService.getAvailableRooms();
                     for (Room u : list) {
                 %>
                 <tr>
                      <td><%=u.getRoomId()%></td>
                     <td><%=u.getRoomType()%></td>
                     <td><%=u.getRoomPrice()%></td>
                     <td><%=u.getGenderType()%></td>  
                 </tr>
                 <%}%>
             <tbody>
                </table> </center>
             <center> <a href = "success.jsp">Back</a></center>
        
    </body>
</html>

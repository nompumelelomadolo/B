<%-- 
    Document   : success
    Created on : Jun 21, 2016, 11:39:28 PM
    Author     : aggie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body style="background-color:lightgrey;">
        <img src="logo.png" width="128" height="150">
        <h1>Successfully logged on</h1>
        <table style="width:50%" border="2">
            <tr>
                <th>REPORTS</th>
                <th>MANAGING</th>
            </tr>
            <tr>
                <td><a href = "TenantReport.jsp">TENANT REPORT</a> </td>
                <td><a href = "AddTen.jsp">Adding Tenant</a></td>
            </tr>
            
             <tr>
                <td> <a href = "RoomRe.jsp">Room REPORT</a> </td>
                <td><a href = "rooms.jsp">Add Room</a></td>
            </tr>
             <tr>
                <td> </td>
                <td><a href = "houses.jsp">Add House</a></td>
            </tr>
             <tr>
                <td> </td>
                <td> <a href = "RegEmp.jsp">Add Employee</a></td>
            </tr>

        </table>
        <%--   <a href = "Tenants.jsp">Add Tenant</a>--%>

        <%-- <a href = "welcomeJSF.jsp">LogOut</a>--%>
        <a href = "logout.jsp">LogOut</a>

       

        

      



    </body>
</html>

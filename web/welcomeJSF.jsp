<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>BSM</title>
            <style>
img { 
    width:100%; 
}
</style>
        </head>
        <body style="background-color:lightgrey;">
            <img src="logo.png" width="128" height="150">
            <h1><center><h:outputText value="Greetings!!!"/></center></h1>
            
            <center><a href = "login.jsp">Login</a></center>
        </body>
    </html>
</f:view>

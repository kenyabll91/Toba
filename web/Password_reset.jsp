<%-- 
    Document   : Password_reset
    Created on : Nov 8, 2016, 2:49:32 PM
    Author     : Kimbreal
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Password</title>
    </head>
    <body>
        <h1>Enter new Password!</h1>
        <p>Username: ${user.username}</p>
        <form action="Password_resetServlet" method="post">
            <label>Password:</label>
            <input type="text" name="password" value="${user.password}"><br>
            <input type="hidden" name="action" value="add">
            <input type="submit" value="Submit"> 
        </form>
        
           
       
    </body>
</html>











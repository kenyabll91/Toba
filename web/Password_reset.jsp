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
        <p><i>${message}</i></p>
        <h1>Enter new Password!</h1>
        
        <form action="Password_resetServlet" method="post">
            <label>Username:</label>
            <p>Username: ${user.userName}</p>
            <input type="text" name="NewPassword" value="${user.passWord}"><br>
            <input type="hidden" name="action" value="add">
            <input type="submit" value="Submit"> 
        </form>
        
           
       
    </body>
</html>











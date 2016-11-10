<%-- 
    Document   : Account_activity
    Created on : Nov 9, 2016, 10:23:58 PM
    Author     : Kimbreal
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Account Activity</h1>
    <c:if test="${user.username != null}">
        <p>Welcome ${user.firstName} ${user.lastName}.<br>
        <c:otherwise>
            <p> Not logged in. <br>
        </c:otherwise>
</c:if>
    </body>
</html>

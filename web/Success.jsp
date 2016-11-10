<%-- 
    Document   : Success
    Created on : Nov 8, 2016, 1:50:01 PM
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
        <p>Hello ${user.firstName}</p>
        <p>Last Name: ${user.lastName}</p>
        <p>Phone Number: ${user.phoneNumber}</p>
        <p>Address: ${user.address}</p>
        <p>City: ${user.city}</p>
        <p>State: ${user.state}</p>
        <p>Zip-code: ${user.zipcode}</p>
        <p>Email: ${user.email}</p>
        <p>Username: ${user.username}</p>
        <p>Password: ${user.password}</p>
    </body>
</html>

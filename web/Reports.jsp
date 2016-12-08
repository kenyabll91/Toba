<%-- 
    Document   : Reports
    Created on : Dec 8, 2016, 1:18:14 AM
    Author     : Kimbreal
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Reports</h1>

        <table>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Phone Number</td>
            <td>Address</td>
            <td>City</td>
            <td>State</td>

            <jsp:include page="/ReportsServlet"/>
            <c:forEach var="u" items="${users}">

                <tr>
                    <td>${u.fistName}</td>
                    <td>${u.lastName}</td>
                    <td>${u.phoneNumber}</td>
                    <td>${u.address}</td>
                    <td>${u.city}</td>
                    <td>${u.state}</td>

                </tr>
            </c:forEach>
        </table>
            <br>
            <p><a href="/UserTableSpreadsheet">Return as an XLS file</a></p>
            <p><a href="../UserTableGZIP">Return using GZIP compression</a></p>
    </body>
</html>

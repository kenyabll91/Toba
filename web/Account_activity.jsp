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
        <title>Account Activity</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="newcss.css" type="text/css">
    </head>
    <body>
        <div id="nav">
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="Login.html">Login</a></li>
            <li><a href="NewCustomer.html">New Customer</a></li>
            <li><a href="Account_activity.jsp">Account Activity</a></li>
            <li><a href="Transfer_funds.jsp">Transfer Funds</a></li>
        </ul>
        </div>
        <h1>Account Activity</h1>
    <c:if test="${user.username != null}">
        <p>Welcome ${user.firstName} ${user.lastName}.<br>
        <c:otherwise>
            <p> Not logged in. <br>
        </c:otherwise>
</c:if>
            <h2>Checking Account:</h2>
            <table>
                <c:forEach var="t" items="${checking.transactions}">
                    <tr>
                        <td>${t.startingBal}</td>
                        <td>${t.finalBalance}</td>
                        <td>${t.amountTransferred}</td>
                        <td>${t.function}</td>
                    </tr>
                </c:forEach>
            </table>
            <h2>Savings Account:</h2>
            <table>
                <c:forEach var="t" items="${savings.transactions}">
                    <tr>
                        <td>${t.startingBal}</td>
                        <td>${t.finalBalance}</td>
                        <td>${t.amountTransferred}</td>
                        <td>${t.function}</td>
                    </tr>
                </c:forEach>
            </table>
            
                  
    </body>
</html>

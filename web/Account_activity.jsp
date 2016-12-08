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
                <li><a href="Login.jsp">Login</a></li>
                <li><a href="NewCustomer.jsp">New Customer</a></li>
                <li><a href="Account_activity.jsp">Account Activity</a></li>
                <li><a href="Transfer_funds.jsp">Transfer Funds</a></li>
                <li><a href="Transaction.jsp">Transaction</a></li>
            </ul>
        </div>
      
        <c:if test="${user == null}">
            <p>Not Logged In</p>
        </c:if>
        <h1>Account Activity</h1>
        <label> First Name:</label>
        <span>${user.firstName}</span>

        <label> Last Name:</label>
        <span>${user.lastName}</span>

        <p>Checking account: ${user.getCheckingBalance()}</p>
        <p>Savings account: ${user.getSavingsBalance()}</p>
    </body>
</html>

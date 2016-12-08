<%-- 
    Document   : Transfer_funds
    Created on : Nov 29, 2016, 11:29:44 PM
    Author     : Kimbreal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="newcss.css" type="text/css">
        <title>Transfer Funds</title>
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
        <h1>Transfer Funds</h1>
        <h2><i>${message1}</i></h2>
        <p>Checking account balance: ${checking.startingBal}</p>
        <p>Savings account balance: ${savings.startingBal}</p>
        <form action="TransactionServlet" method="post">
            <label class="pad_top">Specify amount to transfer:</label>
            <input type="text" name="amount" required><br>
            <input type="submit" value="Submit Transfer" class="margin_left">
        </form><br>
    </body>
</html>

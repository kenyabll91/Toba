<%-- 
    Document   : NewCustomer
    Created on : Dec 7, 2016, 10:40:41 PM
    Author     : Kimbreal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TOBA Titan Online Banking Appliccation</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="newcss.css" type="text/css">
    </head>
    <body>
        <header>
            <h1>TOBA Titan Online Banking Application</h1>
        </header>
        <div id="nav">
        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="Login.html">Login</a></li>
            <li><a href="NewCustomer.html">New Customer</a></li>
            <li><a href="Account_Activity.jsp">Account Activity</a></li>
            <li><a href="Transfer_funds.jsp">Transfer Funds</a></li>
            <li><a href="Transaction.html">Transaction</a></li>
        </ul>
        </div>

        <p><i>${message}</i></p>
        <form action="NewCustomerServlet" method="post">
            <label>First Name:</label>
            <input type="text" name="firstname"><br>
            <label>Last Name:</label>
            <input type="text" name="lastname"><br>
            <label>Phone Number:</label>
            <input type="text" name="phonenumber"><br>
            <label>Address:</label>
            <input type="text" name="address"><br>
            <label>City:</label>
            <input type="text" name="city"><br>
            <label>State:</label>
            <input type="text" name="state"><br>
            <label>Zipcode:</label>
            <input type="text" name="zipcode"><br>
            <label>Email:</label>
            <input type="email" name="email">
            <input type="hidden" name="action" value="add">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>

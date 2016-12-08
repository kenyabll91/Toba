<%-- 
    Document   : Login
    Created on : Dec 7, 2016, 10:37:08 PM
    Author     : Kimbreal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <title>TOBA Titan Online Banking Application</title>
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
            <li><a href="Login.jsp">Login</a></li>
            <li><a href="NewCustomer.html">New Customer</a></li>
            <li><a href="Account_Activity.jsp">Account Activity</a></li>
            <li><a href="Transfer_funds.jsp">Transfer Funds</a></li>
        </ul>
        </div>
        
        <form action="LoginServlet" method="post">
            <input type="hidden" name="action" value="add">
            <label>Username:</label>
            <input type="text" name="username" required><br>
            <label>Password:</label>
            <input type="text" name="password" required>
            
            <input type="submit" value="Submit"> 
        </form>
        
        <a href="NewCustomer.html">New Customer Application</a><br>
        <a href="Password_reset.jsp">Reset Password</a><br>
    </body>
</html>

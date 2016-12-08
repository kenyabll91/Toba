<%-- 
    Document   : Transaction
    Created on : Dec 7, 2016, 10:42:49 PM
    Author     : Kimbreal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Transaction</h1>
         
     
            <h2>Checking Account:</h2>
            <table>
                <td>Starting Balance</td>
                <td>Final Balance</td>
                <td>Amount Transferred</td>
                <td>Function</td>
                <c:forEach var="t" items="${checking.transactions}">
                    <tr>
                        <td>${t.startingBalance}</td>
                        <td>${t.finalBalance}</td>
                        <td>${t.amountTransferred}</td>
                        <td>${t.function}</td>
                    </tr>
                </c:forEach>
            </table>
            <h2>Savings Account:</h2>
            <table>
                        <td>Starting Balance</td>
                        <td>Final Balance</td>
                        <td>Amount Transferred</td>
                        <td>Function</td>
                        <c:forEach var="t" items="${savings.transactions}">
                            <tr>
                               <td>${t.startingBalance}</td>
                               <td>${t.finalBalance}</td>
                               <td>${t.amountTransferred}</td>
                               <td>${t.function}</td> 
                            </tr>   
                </c:forEach>
            </table>              
    </body>
</html>

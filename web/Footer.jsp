<%-- 
    Document   : Footer
    Created on : Nov 9, 2016, 10:32:33 PM
    Author     : Kimbreal
--%>
<html>
<%@page import="java.util.GregorianCalendar, java.util.Calendar"%>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR); %>
    <body>
    <p>&copy; Copyright <%= currentYear  %> Kenya Bell </p>
    </body>
</html>

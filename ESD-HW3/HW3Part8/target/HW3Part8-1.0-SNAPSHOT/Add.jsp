<%-- 
    Document   : Add
    Created on : Feb 20, 2023, 9:33:40 PM
    Author     : aravindsankars
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = "slategrey">

        <h1>Shopping Cart</h1><br><br>
        <div style="display: inline-block">
            <form  style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='Laptop' /> </form><br> 
            <form style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='Phone' > </form><br> 
            <form  style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='tshirt' /> </form><br> 
            <form style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='Cart' /> </form><br> 
        </div>
        <br>
        <br>

        <h2>Products added</h2>
        <ul>
        <c:forEach var="list" items="${sessionScope.newProd}">
            <li>${list.item}</li>
        </c:forEach>
        </ul>
    </body>
</html>

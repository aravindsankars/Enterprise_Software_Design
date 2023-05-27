<%-- 
    Document   : Shop_Cart
    Created on : Feb 20, 2023, 9:31:31 PM
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

        <form method='post' action='Contr_Shop'>

            <c:forEach var="list" items="${sessionScope.master_list}">
                <input type="checkbox" name="elements" value="${list.item}">
                <label >${list.item}</label> <br>
            </c:forEach>

             <input type='hidden' name='List1' value='Remove'/>
            <input type='submit' value='Remove'/> 
        </form>
    </body>
</html>

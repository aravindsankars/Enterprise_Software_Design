<%-- 
    Document   : Laptop
    Created on : Feb 20, 2023, 9:32:27 PM
    Author     : aravindsankars
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = "slategrey">

        <h1>Shopping Cart </h1><br><br>
        <div style="display: inline-block">
            <form  style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='Laptop' /> </form><br> 
            <form style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='Phone' > </form><br> 
            <form  style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='tshirt' /> </form><br> 
            <form style="display: inline-block" action='Contr_Shop' method='post'><input type='submit' name='List1' value='Cart' /> </form><br> 
        </div>
        <br>
        <br>

            <h1>Select the Laptop </h1><br><br>

        <form method='post' action='Contr_Shop'>

            <label for='products'>Products:</label> <br>
            <input type='checkbox' name='products' value='Apple'>
            <label for='a'>Apple</label> <br>
            <input type='checkbox' name='products' value='Lenovo'>
            <label for='b'>Lenovo</label> <br>
            <input type='checkbox' name='products' value='hp'>
            <label for='c'>hp</label> <br>
            <input type='checkbox' name='products' value='dell'>
            <label for='d'>dell</label> <br>
            <input type='hidden' name='List1' value='Output'/>
            <input type='submit' value='Checkout'/> 
        </form>
    </body>
</html>

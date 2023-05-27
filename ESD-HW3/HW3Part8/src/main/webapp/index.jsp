<%-- 
    Document   : index
    Created on : Feb 20, 2023, 10:44:18 PM
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
        <h1>Shopping Cart</h1><br><br>
        <div style="display: inline-block">
            <form  style="display: inline-block" action='Contr_Shop' method='post'>
                <input type='submit' name='List1' value='Laptop' /> 
            </form><br>
            <form style="display: inline-block" action='Contr_Shop' method='post'>
                <input type='submit' name='List1' value='Phone' > 
            </form><br>
            <form  style="display: inline-block" action='Contr_Shop' method='post'>
                <input type='submit' name='List1' value='Tshirt' />
            </form><br> 
            <form style="display: inline-block" action='Contr_Shop' method='post'>
                <input type='submit' name='List1' value='Cart' />
            </form><br> 
        </div>
        <br>
        <br>
    </body>
</html>

<%-- 
    Document   : index
    Created on : Feb 20, 2023, 7:57:38 PM
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
        <h2> How Many books do you want to add ? </h2>
        <form action="${pageContext.servletContext.contextPath}/books.do" method="post">
            <input type="text" name="noofbooks"/>
            <input type="submit" value="Submit"/> <br/> 
            <input type="hidden" name="index" value="add"/> <br/>
        </form>
    </body>
</html>

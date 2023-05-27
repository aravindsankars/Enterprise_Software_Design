<%-- 
    Document   : Add
    Created on : Feb 19, 2023, 12:04:28 AM
    Author     : aravindsankars
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = "slateblue">
        <form action="${pageContext.servletContext.contextPath}/movie.do" method="post">
            <h2> Enter the Movie details below </h2><br><br>
            Title : <input type="text" name="title"/><br>
            Actor : <input type="text" name="actor"/><br>
            Actress : <input type="text" name="actress"/><br>
            Genre : <input type="text" name="genre"/><br>
            Year : <input type="number" name="year"/><br><br>
            <input type="submit" value="Submit"/> <br/> 
            <input type="hidden" name="choice" value="save"/> <br/>
        </form>
    </body>
</html>

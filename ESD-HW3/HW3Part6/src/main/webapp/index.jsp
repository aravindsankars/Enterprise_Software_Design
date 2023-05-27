<%-- 
    Document   : index
    Created on : Feb 19, 2023, 6:10:27 PM
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
        <h1> Movie Collections </h1><br><br>
        <h4> Please make your selection below</h4><br>
        <form action="${pageContext.servletContext.contextPath}/movie.do" method="post">
            <label for="Choice">What action do you wanna do?:</label>
            <select id="Choice" name="choice">
                <option value="browse">Browse Movie</option>
                <option value="add">Add Movie</option>
            </select>
            <input type="submit" value="Submit"/> <br/> 
            <!--<input type="hidden" name="index" value="savemovie"/> <br/>-->
        </form>
    </body>
</html>

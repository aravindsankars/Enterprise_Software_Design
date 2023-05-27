<%-- 
    Document   : Search
    Created on : Feb 18, 2023, 11:56:51 PM
    Author     : aravindsankars
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = "darkgreen">
        <h1>Search for Movie</h1>
        <form action="${pageContext.servletContext.contextPath}/movie.do" method="post">
            Keyword : <input type="text" name="keyword"/>
            <br>
            <br>
            <br>

            <input type="radio" id="sbtitle" name="searchby" value="sbtitle">
            <label for="sbtitle">Search By Title</label><br>
            <input type="radio" id="sbactor" name="searchby" value="sbactor">
            <label for="sbactor">Search By Actor</label><br>
            <input type="radio" id="sbactress" name="searchby" value="sbactress">
            <label for="sbactress">Search By Actress</label><br><br>
            <input type="submit" value="Submit"/> <br/> 
            
            <input type="hidden" name="choice" value="show"/> <br/>
        </form>
    </body>
</html>

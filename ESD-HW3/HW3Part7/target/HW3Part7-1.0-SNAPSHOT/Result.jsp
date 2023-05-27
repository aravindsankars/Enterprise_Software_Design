<%-- 
    Document   : Result
    Created on : Feb 20, 2023, 7:52:25 PM
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
        <c:set var="bookNo" value="${bookNo}"/>
        <%--<c:out  value="${noOfBooks}"/>--%>
        <p><c:out  value="${bookNo}"/>  Books has been added Successfully </p><br><br>
        <a href="${pageContext.servletContext.contextPath}/index.jsp">Home page</a>
    </body>
</html>

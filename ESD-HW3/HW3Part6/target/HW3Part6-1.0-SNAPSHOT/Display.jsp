<%-- 
    Document   : Display
    Created on : Feb 18, 2023, 11:59:39 PM
    Author     : aravindsankars
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor = "darkslategrey">
            <table border="1">
        <th>Title</th>
        <th>Actor</th>
        <th>Actress</th>
        <th>Genre</th>
        <th>Year</th>

        <c:forEach items="${list}" var="record">
            <tr>
                <td>${record.title}</td>
                <td>${record.actor }</td>
                <td>${record.actress }</td>
                <td>${record.genre }</td>
                <td>${record.year }</td>
            </tr>
        </c:forEach>
    </table>
        <br><br>
        <a href="${pageContext.servletContext.contextPath}/index.jsp">Home Page</a>
    </body>
</html>

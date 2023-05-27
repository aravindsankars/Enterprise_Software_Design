<%-- 
    Document   : Part3hw3
    Created on : Feb 20, 2023, 3:05:50 PM
    Author     : aravindsankars
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.mycompany.hw3part3.Part3" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSTL</title>
</head>
<body>
    <h1>JSTL</h1><br><br>
    
    <h2>Core Tag</h2><br>  
        <c:out value="${'People'}"/> 
        <table border="1">
            <th>Email ID</th>
            <th>Name</th>
            <c:forEach var="pers" items="${requestScope.personList}" >
                <tr>
                    <td>${pers.emailID}</td>
                    <td>${pers.Name}</td>
                </tr>
            </c:forEach>
        </table>
        
        <c:import var="data" url="https://example-files.online-convert.com/document/txt/example.txt"/>   
        <c:out value="${data}"/> 
        <br>
        
            <h2>Function Tag </h2><br>
        <ul>
            
            <li>Uppercase: ${fn:toUpperCase("hello")}</li>
            <li>Substring: ${fn:substring("Hello, World!", 0, 8)}</li>
            <li>Length of the string "Hello, World!": ${fn:length("Hello, World!")}</li>
            
            
        </ul>
            <br>    
    
    <h2>Formatting Tag</h2><br>  
        <jsp:useBean id="now" class="java.util.Date" />
	

        <ul>
            <li><fmt:formatNumber value="12345.678" pattern="#,##0.00" /></li>
            <li>Date and Time: <fmt:formatDate value="${now}" pattern="MM/dd/yyyy hh:mm:ss a" /></li>
            <li><fmt:parseNumber value="$1,234.56" type="currency" var="price" /><c:out value="${price}" /></li>
        </ul>
        <br>
            

</body>
</html>


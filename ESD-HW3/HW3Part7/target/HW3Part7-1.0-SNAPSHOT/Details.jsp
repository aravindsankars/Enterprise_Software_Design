<%-- 
    Document   : Details
    Created on : Feb 20, 2023, 7:56:18 PM
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
         <h1>Add the Book details below!</h1>
        <c:set var="noOfBooks" value="${noOfBooks}"/>
        <c:out  value="${noOfBooks}"/>
        <form action="${pageContext.servletContext.contextPath}/books.do" method="post">
            <table>
                <th>ISBN</th>
                <th>Book Title</th>
                <th>Author</th>
                <th>Price</th>
                <%
                    int noOfBooks = Integer.parseInt((String)(request.getAttribute("noOfBooks")));
                    System.out.println("noOfBooks in JSP -> " + noOfBooks);
                %>
                <% for (int i = 0; i < noOfBooks; i++) { %>
                    <tr>
                        <td>
                            <input name="isbn-<%= i %>" maxlength="12">
                        </td>
                        <td>
                            <input name="title-<%= i %>" maxlength="60">
                        </td>
                        <td>
                            <input name="authors-<%= i %>" maxlength="60">
                        </td>
                        <td>
                            <input name="price-<%= i %>">
                        </td>
                    </tr>
                <% } %>
                
            </table>
            <br/>
            <input type="submit" value="Submit"/> <br/>
            <input type="hidden" name="index" value="listofbook"/>
        </form>
        
    </body>
</html>

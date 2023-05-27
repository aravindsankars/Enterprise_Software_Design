# Enterprise_Software_Design
Course that used popular frameworks (JavaEE, Spring Boot, Spring MVC, Hibernate) that increase productivity, empower developers, and greatly simplify web development.

# Enterprise Software Design Repository

This repository contains the assignments for the Enterprise Software Design course. Each assignment is organized in a separate folder along with any necessary instructions or additional files.

## Assignments

-   Assignment 1: Brief description or topic covered in Assignment 1
-   Assignment 2: Brief description or topic covered in Assignment 2

-   Assignment 3: 

Part 1. Reading Assignment (Expression Language)

JSP 2.0 introduced a shorthand language for evaluating and outputting the values of Java objects that are stored in standard locations. This expression language (EL) is one of the two important new features of JSP 2; the other is the ability to define custom tags with JSP syntax.

https://web.archive.org/web/20190709230504/http://pdf.coreservlets.com/JSP-EL.pdf

Part 2. Reading Assignment - ATTACHED

The JavaServer Pages Standard Tag Library (JSTL) encapsulates core functionality common to many JSP applications. Instead of mixing tags from numerous vendors in your JSP applications, JSTL allows you to employ a single, standard set of tags. This standardization allows you to deploy your applications on any JSP container supporting JSTL and makes it more likely that the implementation of the tags is optimized. JSTL has tags such as iterators and conditionals for handling flow control, tags for manipulating XML documents, internationalization tags, tags for accessing databases using SQL, and commonly used functions.

Part 3. Programming Assignment

Create a JSP page that uses at least 3 JSTL tags from each tag library group, i.e.,3 tags from Core Tag Lib, 3 tags from Formatting Tag Lib, etc. You could use random content on the JSP page.

https://www.javatpoint.com/jstl

Part 4. Reading Assignment (The JSP Page Directive)

Chapter 12: Controlling the Structure of Generated Servlets: the JSP page Directive

https://web.archive.org/web/20190406085410/http://pdf.coreservlets.com/JSP-page-Directive.pdf

Part 5. Reading Assignment (JDBC) - ATTACHED

JDBC provides a standard library for accessing relational databases. By using the JDBC API, you can access a wide variety of SQL databases  
with exactly the same Java syntax. It is important to note that although the JDBC API standardizes the approach for connecting to databases,  
the syntax for sending queries and committing transactions, and the data structure representing the result, JDBC does not attempt to standardize the SQL syntax. So, you can use any SQL extensions your database vendor supports. However, since most queries follow standard SQL syntax, using JDBC lets you change database hosts, ports, and even database vendors with minimal changes to your code.

Part 6. Programming Assignment

Create an MVC application to browse movies and add new movies to the DB. (You may change/improve/simplify the views). For those of you who don’t know how to create a database, we could create one on the server, and send you the Connection information. [Refer to the screenshots below]

Part 7. Programming Assignment

Create an MVC application and use PreparedStatement to enter the books to the database. [Refer to the screenshots below]

Part 8. Programming Assignment

Create an MVC application. You will be using a session object to store and retrieve selected items from a simple shopping cart application. Shopping cart applications typically allow users to select items from a catalog and place them in a virtual shopping cart. When the user selects some items and presses the Add to Cart" button, the servlet will add the selected items to the session object and then retrieve all of the items currently in the session object and then display them in the browser. Removing an item from the shopping cart will be from the same servlet. Use URL-rewriting or hidden fields

as necessary to use the same servlet for adding and removing items. [Refer to the screenshots below].  
Add Programmatic Security [https://web.archive.org/web/20200206032018/http://pdf.moreservlets.com/More-Servlets-and-JSP-Chapter-08.pdf]

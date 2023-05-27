# Enterprise_Software_Design
Course that used popular frameworks (JavaEE, Spring Boot, Spring MVC, Hibernate) that increase productivity, empower developers, and greatly simplify web development.

# Enterprise Software Design Repository

This repository contains the assignments for the Enterprise Software Design course. Each assignment is organized in a separate folder along with any necessary instructions or additional files.

## Assignments

-   **Assignment 1**: Brief description or topic covered in Assignment 1

**Part 1. Reading Assignment** 
https://web.archive.org/web/20190406064813/http://pdf.coreservlets.com/HTTP-Request-Headers.pdf  
https://web.archive.org/web/20190406090817/http://pdf.coreservlets.com/HTTP-Status-Codes.pdf  
If the site is down, then here is the link to the whole book: https://learning.oreilly.com/library/view/-/0130092290/?ar=  
To login: select, Northeastern University not listed. Then enter your email as "username@northeastern.edu"  

**Part 2. Programming Assignment**  
Write a servlet, to be created and deployed manually without using any IDE to display request headers using:  
Enumeration getHeaderNames()  
Enumeration getHeaders(String name)  
https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequest.html  

**Part 3.1. Programming Assignment**  
Create a Servlet to handle the form submission. The design and layout do not need to be the same as the form below. As long as you  
provide the same fields, that is fine. You may ignore the layout, but if you know Bootstrap and CSS, you may use it). 

**PART 3.2. Programming Assignment**  
Redo 3.1 and use getParameterMap()  
https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html#getParameterMap--  

**PART 3.3. Programming Assignment** 
Redo 3.1 and use getParameterNames()  
https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html#getParameterNames--  

**PART 4. Programming Assignment**  
Create an HTML form to capture the information as shown in the following PDF page. PDF forms are designed to print and fill out by  
hand, so the layout is optimized to fit all the fields in a single page, but there is no such a requirement for the layout for the web forms.  
So, the design and layout of the form may be very different from the PDF form. Design the web form in any way you like, using CSS  
libraries if you like, to capture the same information. Also, in the layout, you may see underlined fields or table cells for users to write  
information, but you cannot capture user input from an HTML page just by underlining or creating a table cell. A form element is needed for  
users to enter information.  
https://assets.hrm.northeastern.edu/pdfs/tuition_waiver/TuitionWaiverForm.pdf  

**PART 5. Programming Assignment**  
Create a servlet to use and display all the getX() methods from the HttpServletRequest class:  
https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequest.html  
and all the inherited getX() methods from the super interface ServletRequest:  
https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html  
If a getX() method returns something that cannot be printed, just skip that method.

-   **Assignment 2**: 

**Part 1. Reading Assignment (Chapter 48)**  
[https://docs.oracle.com/javaee/7/JEETT.pdfLinks to an external site.](https://docs.oracle.com/javaee/7/JEETT.pdf)

**Part 2. Reading Assignment (Declarative Web Application Security)**  
[http://pdf.moreservlets.com/More-Servlets-and-JSP-Chapter-07.pdf [Site was down - if still down, use the next link]Links to an external site.](http://pdf.moreservlets.com/More-Servlets-and-JSP-Chapter-07.pdf)  
  [https://learning.oreilly.com/library/view/more-servlets-and/0130676144/0130676144_ch07.htmlLinks to an external site.](https://learning.oreilly.com/library/view/more-servlets-and/0130676144/0130676144_ch07.html)

**Part 3. Reading Assignment (Controlling Web Application Behavior with web.xml)**  
[https://learning.oreilly.com/library/view/more-servlets-and/0130676144/0130676144_ch05.html#ch05Links to an external site.](https://learning.oreilly.com/library/view/more-servlets-and/0130676144/0130676144_ch05.html#ch05)

**Part 4. Programming Assignment**
Read the attached CSV file ([parking_facilities.csv](https://northeastern.instructure.com/courses/136975/files/19783798?wrap=1 "parking_facilities.csv") [Download parking_facilities.csv](https://northeastern.instructure.com/courses/136975/files/19783798/download?download_frd=1)) using CsvJdbc Driver - [http://csvjdbc.sourceforge.net (Links to an external site.)Links to an external site.](http://csvjdbc.sourceforge.net/)

Web Application’s welcome page initially displays a FORM in a HTML page having a textbox for the user to enter the name of the CSV file. This form will be submitted to a Servlet (you could use either annotations or XML mapping) that will read the name of the file, and connect to the CSV file using CsvJdbc. Once the connection is established, the servlet will get the data from the CSV file, print the data on the browser (you may use an HTML table if you want). When creating a URL-pattern use the extension .xls for the servlet.

**Part 5. Programming Assignment**
Read the attached Excel File ([store.xls](https://northeastern.instructure.com/courses/136975/files/19783809?wrap=1 "store.xls") [Download store.xls](https://northeastern.instructure.com/courses/136975/files/19783809/download?download_frd=1)) using Apache POI - [http://poi.apache.org/ (Links to an external site.)Links to an external site.](http://poi.apache.org/)

Create an Annotated Servlet that will read the excel file, and print the contents of the excel file to user’s browser. You may use an HTML table to display the data.  
Create .xls URL pattern for the Servlet page using Annotations.  
Once done, add Declarative Web Application Security [described in part 2.2].

**Part 6. Programming Assignment**
Redo HW1-Part 4  
Map the Servlet using Annotations (Netbeans does this automatically)  
Add Declarative Security.  
[https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html#getParameterNames-- (Links to an external site.)Links to an external site.](https://docs.oracle.com/javaee/7/api/javax/servlet/ServletRequest.html#getParameterNames--)

**Part 7. Programming Assignment**  
You will be using a session object to store and retrieve selected items from a simple shopping cart application. Shopping  
cart applications typically allow users to select items from a catalog and place them in a virtual shopping cart. When the user selects some items and  presses the Add to Cart" button, the servlet will add the selected items to the session object and then retrieve all of the items currently in the session object and then display them in the browser. Removing an item from the shopping cart will be from the same servlet.

Use URL-rewriting or hidden fields as necessary to use the same servlet for adding and removing items. Add Programmatic Security [https://web.archive.org/web/20200206032018/http://pdf.moreservlets.com/More-Servlets-and-JSP-Chapter-08.pdf]



-   **Assignment 3**: 

**Part 1. Reading Assignment (Expression Language)**

JSP 2.0 introduced a shorthand language for evaluating and outputting the values of Java objects that are stored in standard locations. This expression language (EL) is one of the two important new features of JSP 2; the other is the ability to define custom tags with JSP syntax.

https://web.archive.org/web/20190709230504/http://pdf.coreservlets.com/JSP-EL.pdf

**Part 2. Reading Assignment - ATTACHED**

The JavaServer Pages Standard Tag Library (JSTL) encapsulates core functionality common to many JSP applications. Instead of mixing tags from numerous vendors in your JSP applications, JSTL allows you to employ a single, standard set of tags. This standardization allows you to deploy your applications on any JSP container supporting JSTL and makes it more likely that the implementation of the tags is optimized. JSTL has tags such as iterators and conditionals for handling flow control, tags for manipulating XML documents, internationalization tags, tags for accessing databases using SQL, and commonly used functions.

**Part 3. Programming Assignment**

Create a JSP page that uses at least 3 JSTL tags from each tag library group, i.e.,3 tags from Core Tag Lib, 3 tags from Formatting Tag Lib, etc. You could use random content on the JSP page.

https://www.javatpoint.com/jstl

**Part 4. Reading Assignment (The JSP Page Directive)**

Chapter 12: Controlling the Structure of Generated Servlets: the JSP page Directive

https://web.archive.org/web/20190406085410/http://pdf.coreservlets.com/JSP-page-Directive.pdf

**Part 5. Reading Assignment (JDBC) - ATTACHED**

JDBC provides a standard library for accessing relational databases. By using the JDBC API, you can access a wide variety of SQL databases  
with exactly the same Java syntax. It is important to note that although the JDBC API standardizes the approach for connecting to databases,  
the syntax for sending queries and committing transactions, and the data structure representing the result, JDBC does not attempt to standardize the SQL syntax. So, you can use any SQL extensions your database vendor supports. However, since most queries follow standard SQL syntax, using JDBC lets you change database hosts, ports, and even database vendors with minimal changes to your code.

**Part 6. Programming Assignment**

Create an MVC application to browse movies and add new movies to the DB. (You may change/improve/simplify the views). For those of you who don’t know how to create a database, we could create one on the server, and send you the Connection information.

**Part 7. Programming Assignment**

Create an MVC application and use PreparedStatement to enter the books to the database.

**Part 8. Programming Assignment**

Create an MVC application. You will be using a session object to store and retrieve selected items from a simple shopping cart application. Shopping cart applications typically allow users to select items from a catalog and place them in a virtual shopping cart. When the user selects some items and presses the Add to Cart" button, the servlet will add the selected items to the session object and then retrieve all of the items currently in the session object and then display them in the browser. Removing an item from the shopping cart will be from the same servlet. Use URL-rewriting or hidden fields as necessary to use the same servlet for adding and removing items. 
Add Programmatic Security [https://web.archive.org/web/20200206032018/http://pdf.moreservlets.com/More-Servlets-and-JSP-Chapter-08.pdf]

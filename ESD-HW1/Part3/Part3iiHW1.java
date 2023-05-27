import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Part3iiHW1 extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        Enumeration<String> e = request.getParameterNames();

        while(e.hasMoreElements())
    {
      String name = e.nextElement();
      String[] value = request.getParameterValues(name);   
      out.println("<ul>");
                for(int i=0; i<value.length; i++) 
                {
                    out.println("<li>" + value[i] + "</li>");
                }
      out.println("</ul>");
    }


   }

    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }

//    public void destroy() {
//
//    }
}

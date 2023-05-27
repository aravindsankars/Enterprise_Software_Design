import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class Part2HW1 extends HttpServlet{


    int count = 0;
    
    public void init() {
    	
    }
	
	
	public void service(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        Enumeration e = request.getHeaderNames();

        out.println("Following are the Headers coming from the Client: \n");
 
        out.println(" ");

        //String name;
        //String value;

        while(e.hasMoreElements())
    {
      String name = (String) e.nextElement();
      String value = request.getHeader(name);   
      out.println("");
      out.println(" " +name + " " +value+ "");
    }
        out.close();
    }

        
//        out.println("<!DOCTYPE HTML>");
//        out.println("<HTML>");
//        out.println("<head><title>HelloServlet</title></head>");
//        out.println("<body>");
//        out.println("<h1>Running HelloServlet..</h1>");
//        out.println("<p>Count = </></h1>" + count);

//        out.println("</body>");
//        out.println("</HTML>");

 //  }


   // doPost(HttpServletRequest request, HttpServletResponse response)
   // doPut(HttpServletRequest request, HttpServletResponse response)
   // doDelete(HttpServletRequest request, HttpServletResponse response)

	public void destroy(){
		
	}
}

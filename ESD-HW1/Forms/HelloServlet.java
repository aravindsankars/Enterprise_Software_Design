import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;


public class HelloServlet extends HttpServlet{


    int count = 0;
    
    public void init() {
    	
    }
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        count++;

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE HTML>");
        out.println("<HTML>");
        out.println("<head><title>HelloServlet</title></head>");
        out.println("<body>");
        out.println("<h1>Running HelloServlet..</h1>");
        out.println("<p>Count = </></h1>" + count);

        out.println("</body>");
        out.println("</HTML>");

    }
   // doPost(HttpServletRequest request, HttpServletResponse response)
   // doPut(HttpServletRequest request, HttpServletResponse response)
   // doDelete(HttpServletRequest request, HttpServletResponse response)

	public void destroy(){
		
	}
}
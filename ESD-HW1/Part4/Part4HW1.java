import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;


public class Part4HW1 extends HttpServlet {

	public void init(ServletConfig sconfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE HTML>");
		out.println("<HTML>");
		out.println("<head><title>Result</title></head>");
		out.println("<body>");
		
		
		Map<String, String[]> map= request.getParameterMap();
		Iterator<Map.Entry<String, String[]>> entries = map.entrySet().iterator();
		
		while(entries.hasNext())
		{
			Entry<String, String[]>  entry = entries.next();
			//out.println(entry.getKey()+ "<br><br>");
			String values[] = entry.getValue();
			for(String value:values)
			{
				out.println("<b>" +  entry.getKey());
				out.println(" value -> "+"</b>" + value + "<br><br>");
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
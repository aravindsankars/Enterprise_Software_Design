import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class Part5 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><body>");
    out.println("<h2>GetX</h2>");

    Method[] methods = HttpServletRequest.class.getMethods();

    for (Method method: methods){
      String mName = method.getName();
      if (mName.length() < 3) {
        continue;
      }
      else if ((mName.substring(0, 3)).equals("get") && method.getParameterCount() == 0) {
        try {
          Object output = method.invoke(request);
          out.println("<p><b>" + mName + "</b>: " + output.toString() + "</p><br>");
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    }
		
		out.println("</body></html>");
	}
}
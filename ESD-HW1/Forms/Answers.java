import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Answers extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String picture = request.getParameter("picture");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		String hobby = request.getParameter("hobby");
		String address = request.getParameter("address");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html><html><body>");
		out.println("<p><b>Email: </b>" + email + "</p><br>");
		out.println("<p><b>Picture: </b>" + picture + "</p><br>");
		out.println("<p><b>Password: </b>" + password + "</p><br>");
		out.println("<p><b>Gender: </b>" + gender + "</p><br>");
		out.println("<p><b>Country: </b>" + country + "</p><br>");
		out.println("<p><b>Hobby: </b>" + hobby + "</p><br>");
		out.println("<p><b>Address: </b>" + address + "</p><br>");
		out.println("</body></html>");
  }
}


import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Part3iiiHW1 extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        Map<String, String[]> allMap = request.getParameterMap();

        for (String key : allMap.keySet()) {
            String[] strArr = (String[]) allMap.get(key);
            for (String val : strArr) {
                System.out.println("Parameter-Map values: " + val);
            }
        }

    }

    // Method to handle POST method request.
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }

    // public void destroy() {
    //
    // }
}
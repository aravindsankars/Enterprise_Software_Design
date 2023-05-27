/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aravindsankars
 */
public class Part7hw2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            /* TODO output your page here. You may use following sample code. */
           
            String auth = request.getHeader("Authorization");
        if (auth == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setHeader("WWW-Authenticate", "BASIC realm=\"Inventory\"");
        } else {
            String mainUser = auth.substring(6).trim();
            //String decodedInfo = Base64.getDecoder().decode(userInfo).toString();
            byte[] deCB = Base64.getDecoder().decode(mainUser);
            String[] loginCred = new String(deCB, StandardCharsets.UTF_8).split(":");
            String un = loginCred[0];
            String pwd = loginCred[1];

            if (un.equals("admin") && pwd.equals("password")) {
            }
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        List<String> prods = new ArrayList<>();

        HttpSession session = request.getSession();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Part7hw2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Aravind's Inventory" + request.getContextPath() + "</h1>");
        out.println("<div style=\"background-color:slateblue;\">");
        out.println(
                " <form action='Inventory' method='post'>"
                        + "<input type='submit' name='product' value='Sports' /> "
                        + "</form> ");
        out.println(
                " <form action='Inventory' method='post'>"
                        + "<input type='submit' name='product' value='Vehicles' /> "
                        + "</form> ");
        out.println(
                " <form action='Inventory' method='post'>"
                        + "<input type='submit' name='product' value='Gadgets' /> "
                        + "</form> ");
        out.println(
                " <form action='Inventory' method='post'>"
                        + "<input type='submit' name='product' value='Cart' /> "
                        + "</form> </div>");
        out.println("<br>");
        out.println("<br>");
        out.println("<br>");
        
        String valueNum = request.getParameter("product");
        
            if(valueNum.equals("Sports")) {
                out.println("<div style=\"background-color:slategrey;\">");
                out.println("<form method='post' action='Inventory'>");
                out.println(" <label for='products'>Products:</label> <br>");
                out.println("<input type='checkbox' name='products' value='Cleats'>");
                out.println("<label for='a'>Cleats</label> <br>");
                out.println("<input type='checkbox' name='products' value='Football'>");
                out.println("<label for='b'>Football</label> <br>");
                out.println("<input type='checkbox' name='products' value='Bat'>");
                out.println("<label for='a'>Bat</label> <br>");
                out.println("<input type='checkbox' name='products' value='Ball'>");
                out.println("<label for='b'>Ball</label> <br>");
                out.println("<input type='hidden' name='product' value='Done'/>");
                out.println("</div>");
            }

            else if(valueNum.equals("Vehicles")){
                out.println("<div style=\"background-color:slategrey;\">");
                out.println("<form method='post' action='Inventory'>");
                out.println(" <label for='products'>Products:</label> <br>");
                out.println("<input type='checkbox' name='products' value='Porsche'>");
                out.println("<label for='a'>Porsche</label> <br>");
                out.println("<input type='checkbox' name='products' value='Ferrari'>");
                out.println("<label for='b'>Ferrari</label> <br>");
                out.println("<input type='checkbox' name='products' value='Ford'>");
                out.println("<label for='a'>Ford</label> <br>");
                out.println("<input type='checkbox' name='products' value='Toyota'>");
                out.println("<label for='b'>Toyota</label> <br>");
                out.println("<input type='hidden' name='product' value='Done'/>");
                out.println("</div>");
            }

            else if(valueNum.equals("Gadgets")){
                out.println("<div style=\"background-color:slategrey;\">");
                out.println("<form method='post' action='Inventory'>");
                out.println(" <label for='products'>Products:</label> <br>");
                out.println("<input type='checkbox' name='products' value='Apple'>");
                out.println("<label for='a'>Apple</label> <br>");
                out.println("<input type='checkbox' name='products' value='OnePlus'>");
                out.println("<label for='b'>OnePlus</label> <br>");
                out.println("<input type='checkbox' name='products' value='Samsung'>");
                out.println("<label for='a'>Samsung</label> <br>");
                out.println("<input type='checkbox' name='products' value='Sony'>");
                out.println("<label for='b'>Sony</label> <br>");  
                out.println("<input type='hidden' name='product' value='Done'/>");
                out.println("</div>");

            }
            else if(valueNum.equals("Cart"))
            {
                out.println("<div style=\"background-color:goldenrod;\">");
                out.println("<form method='post' action='Inventory'>");
                List<String> item = (List<String>) session.getAttribute("updatedProduct");
                for (String it : item) {
                    out.println("<input type='checkbox' name='elements' value=" + it + ">" + it);
                    out.println("<br>");
                    out.println("<input type='hidden' name='product' value='Done1'/>");
                }
                out.println("</div>");
            }    
                else if(valueNum.equals("Done")) {
                out.println("<div style=\"background-color:goldenrod;\">");
                String[] products = request.getParameterValues("products");
                List<String> products1 = Arrays.asList(products);
                if (session.getAttribute("updatedProduct") == null) {

                    session.setAttribute("updatedProduct", products1);
                } else {
                    prods.clear();
                    prods.addAll((List<String>) session.getAttribute("updatedProduct"));

                    for (String it : products1) {
                        prods.add(it);
                    }
                    session.setAttribute("updatedProduct", prods);
                }
                session.setAttribute("newProduct", products1);
                out.println("<h2>Products are added to the cart successfully!!</h2>");
                List<String> itemCart = (List<String>) session.getAttribute("newProduct");
                for (String cartItem : itemCart) {
                    out.println(cartItem + "<br>");
                }
                out.println("</div>");
            }
                        else if(valueNum.equals("Done1")) {
                out.println("<div style=\"background-color:goldenrod;\">");
                String[] products0 = request.getParameterValues("elements");
                prods.clear();
                prods.addAll((List<String>) session.getAttribute("updatedProduct"));
                out.println("<h2> Selected product are removed from the cart successfully!!</h2>");
                List<String> products1 = Arrays.asList(products0);
                for (String it : products1) {
                    out.println("<p>" + it + "</p>");
                    prods.remove(it);
                }
                session.setAttribute("updatedProduct", prods);
                out.println("</div>");
            }

        if (valueNum.equals("Sports") || valueNum.equals("Vehicles") || valueNum.equals("Gadgets")) {
            out.println("<input type='submit' value='Checkout'/> ");
        } else if (valueNum.equals("Cart")) {

            out.println("<input type='submit' value='Remove'/> ");
        }
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

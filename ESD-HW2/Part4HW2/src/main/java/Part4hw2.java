/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aravindsankars
 */
public class Part4hw2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Part4hw2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Part4hw2 at " + request.getContextPath() + "</h1>");
            String res = request.getParameter("filename");

            try {
                Class.forName("org.relique.jdbc.csv.CsvDriver");

                String url = "jdbc:relique:csv:" + "/Users/aravindsankars/Documents/NetBeansProjects/Part4HW2";
                Connection con;
                con = DriverManager.getConnection(url);
                Statement stmt = con.createStatement();

                int howMany = 100;
                int pageNum = 0;

                if (request.getParameter("pageNum") == null) {
                    pageNum = 1;
                } else {
                    pageNum = Integer.parseInt(request.getParameter("pageNum"));
                }

                ResultSet rs = stmt.executeQuery("SELECT * from parking_facilities LIMIT " + howMany + " OFFSET " + (pageNum - 1) * howMany);
                ResultSetMetaData rsmd = rs.getMetaData();
                int colNum = rsmd.getColumnCount();
                out.println("<table border='1'>");
                while (rs.next()) {
                    out.println("<tr>");
                    for (int i = 1; i <= colNum; i++) {
                        String col = rs.getString(i);
                        out.println("<td>" + col + "</td>");
                    }
                    out.println("</tr>");
                }
                out.println("</table>");

                out.println("<hr/>");

                for (int i = 1; i < 21; i++) {
                    out.println("<a href='Part4hw2?pageNum=" + i + "'>" + i + "</a>");
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Part4hw2.class.getName()).log(Level.SEVERE, null, ex);
            }

            out.println("<h1>" + res + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Part4hw2.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Part4hw2.class.getName()).log(Level.SEVERE, null, ex);
        }
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

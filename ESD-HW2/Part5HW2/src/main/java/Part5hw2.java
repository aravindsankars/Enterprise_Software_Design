/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

//import java.io.BufferedReader;
//import java.io.DataInputStream;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//import java.util.StringTokenizer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.FormulaEvaluator;
//import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author aravindsankars
 */
@WebServlet(name = "Part5hw2", urlPatterns = {"/store.xls"})
public class Part5hw2 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Part5hw2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Part5hw2 at " + request.getContextPath() + "</h1>");
            
            FileInputStream fins = new FileInputStream("/Users/aravindsankars/Downloads/store.xls");
            
            HSSFWorkbook wb = new HSSFWorkbook(fins);
            
            for (int i = 0; i < wb.getNumberOfSheets(); i++) {
                HSSFSheet sheet = wb.getSheetAt(i);
                out.println("<p>" + String.valueOf(i + 1) + ". " + sheet.getSheetName() + "</p>");
                out.println("<H1 ALIGN=\"CENTER\"></H1>"
                        + "<BR><BR>\n"
                        + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
                        + "<TR>\n");
                for (int j = 0; j < sheet.getLastRowNum() + 1; j++) {
                    HSSFRow row = sheet.getRow(j);
                    out.println("<tr>");
                    for (int k = 0; k < row.getLastCellNum(); k++) {
                        HSSFCell cell = row.getCell(k);
                        if (j == 0) {
                            out.println("<th>" + cell.toString());
                        } else {
                            out.println("<td>" + cell.toString());
                        }
                    }
                }
                out.println("</table>");
            }

            out.println("</body>");
            out.println("</html>");
            
	}
}

    //for (int k = 0; k < workbook.getNumberOfSheets(); k++) {
    //            HSSFSheet sheet = workbook.getSheetAt(k);
    //            out.println("<p>" + String.valueOf(k + 1) + ". " + sheet.getSheetName() + "</p>");
    //            out.println("<H1 ALIGN=\"CENTER\"></H1>"
    //                    + "<BR><BR>\n"
    //                    + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
    //                    + "<TR>\n");
    //            for (int i = 0; i < sheet.getLastRowNum() + 1; i++) {
    //                HSSFRow row = sheet.getRow(i);
    //                out.println("<tr>");
    //                for (int j = 0; j < row.getLastCellNum(); j++) {
    //                    HSSFCell cell = row.getCell(j);
    //                    if (i == 0) {
    //                        out.println("<th>" + cell.toString());
    //                    } else {
    //                        out.println("<td>" + cell.toString());
    //                    }
    //                }
    //            }
    //            out.println("</table>");
    //        }

    //        out.println("</body>");
    //        out.println("</html>");

    
    
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

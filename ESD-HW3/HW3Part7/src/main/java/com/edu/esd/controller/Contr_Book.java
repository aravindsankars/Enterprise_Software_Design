/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.edu.esd.controller;

import com.edu.esd.model.Model_Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aravindsankars
 */
@WebServlet(name = "Contr_Book", urlPatterns = {"/books.do"})
public class Contr_Book extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        String choice = request.getParameter("index");
        String noOfBooks = request.getParameter("noofbooks");
        System.out.println("Number of books : " + noOfBooks);
        System.out.println("choice : " + choice);

        switch (choice) {
            case "add":
                request.setAttribute("noOfBooks", noOfBooks);
                RequestDispatcher rd = request.getRequestDispatcher("/Details.jsp");
                rd.forward(request, response);
                break;
            case "listofbook":
                String SQL_INSERT_QUERY = "INSERT INTO books"
                        + "  ( isbn, title, authors, price) VALUES "
                        + " (?, ?, ?, ?);";
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdb", "root", "root@user1");
                int i = 0;
                int bookNo = 0;
                while (request.getParameter("isbn-" + i) != null) {
                    String isbn = request.getParameter("isbn-" + i);
                    String title = request.getParameter("title-" + i);
                    String authors = request.getParameter("authors-" + i);
                    float price = Float.parseFloat(request.getParameter("price-" + i));
                    int result = 0;
                    Model_Book book_model = new Model_Book();
                    book_model.setIsbn(isbn);
                    book_model.setTitle(title);
                    book_model.setAuthor(authors);
                    book_model.setPrice(price);

                    i++;
                    System.out.println(book_model.getIsbn() + " " + book_model.getTitle() + " " + book_model.getAuthor() + " " + book_model.getPrice());
                    PreparedStatement preparedStatement;
                    preparedStatement = connection.prepareStatement(SQL_INSERT_QUERY);
                    preparedStatement.setString(1, book_model.getIsbn());
                    preparedStatement.setString(2, book_model.getTitle());
                    preparedStatement.setString(3, book_model.getAuthor());
                    preparedStatement.setFloat(4, book_model.getPrice());
                    System.out.println(preparedStatement);

                    result = preparedStatement.executeUpdate();
                    System.out.println("result  - > " + result);
                    bookNo += result;
                }

                request.setAttribute("bookNo", bookNo);
                RequestDispatcher rd1 = request.getRequestDispatcher("/Result.jsp");
                rd1.forward(request, response);

                break;

            default:
                break;

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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contr_Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Contr_Book.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contr_Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Contr_Book.class.getName()).log(Level.SEVERE, null, ex);
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

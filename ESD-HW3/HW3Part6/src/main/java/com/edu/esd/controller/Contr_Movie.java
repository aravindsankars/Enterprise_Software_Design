/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.edu.esd.controller;

import com.edu.esd.model.Model_Movie;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Contr_Movie", urlPatterns = {"/movie.do"})
public class Contr_Movie extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String choice = request.getParameter("choice");
        System.out.println("choice" + choice);

        String SQL_INSERT_QUERY = "INSERT INTO movie"
                + " (title, actor, actress, genre, year) VALUES "
                + " (?, ?, ?,?,?);";

        int result = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
        }
//        Class.forName("com.mysql.jdbc.Driver");
        
//jdbc:mysql://localhost:3306/?user=root
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviesdb", "root", "root@user1");

        switch (choice) {
            case "add":
                System.out.println("in addmovie");
                response.sendRedirect("Add.jsp");
                break;
            case "browse":
                response.sendRedirect("Search.jsp");
                break;
            case "save":
                String title = request.getParameter("title");
                String actor = request.getParameter("actor");
                String actress = request.getParameter("actress");
                String genre = request.getParameter("genre");
                String year = request.getParameter("year");
                Model_Movie movie = new Model_Movie();
                movie.setTitle(title);
                movie.setActor(actor);
                movie.setActress(actress);
                movie.setGenre(genre);
                movie.setYear(year);
                PreparedStatement ps;
                ps = connection.prepareStatement(SQL_INSERT_QUERY);

                ps.setString(1, movie.getTitle());
                ps.setString(2, movie.getActor());
                ps.setString(3, movie.getActress());
                ps.setString(4, movie.getGenre());
                ps.setString(5, movie.getYear());
                System.out.println(ps);
                // Step 3: Execute the query or update query
                result = ps.executeUpdate();
                System.out.println("result");

                RequestDispatcher rd1 = request.getRequestDispatcher("AddSuccess.jsp");
                rd1.forward(request, response);
                break;

            case "show":
               // System.out.println("in showmovie");
                String keyword = request.getParameter("keyword");
                String searchby = request.getParameter("searchby");

                //moviedb.movieSearch(keyword);
                String query = "";
                System.out.println("keyword : " + keyword);
                System.out.println("searchby : " + searchby);

                switch (searchby) {
                    case "sbtitle":
                        query = "select * from movie where title like '%" + keyword + "%'";
                        break;
                    case "sbactor":
                        query = "select * from movie where actor like '%" + keyword + "%'";
                        break;
                    case "sbactress":
                        query = "select * from movie where actress like '%" + keyword + "%'";
                        break;
                    default:
                        break;
                }

                List<Model_Movie> list = new ArrayList<>();
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while (rs.next()) {

                    Model_Movie movie_model = new Model_Movie();
                    movie_model.setTitle(rs.getString("title"));
                    movie_model.setActor(rs.getString("actor"));
                    movie_model.setActress(rs.getString("actress"));
                    movie_model.setGenre(rs.getString("genre"));
                    movie_model.setYear(rs.getString("year"));

                    list.add(movie_model);
                    System.out.println("---x---From DB---x---");
                    System.out.println(movie_model.getTitle());
                    System.out.println(movie_model.getActor());
                    System.out.println(movie_model.getActress());
                    System.out.println(movie_model.getGenre());
                    System.out.println(movie_model.getYear());
                    System.out.println("---x------x------x---");

                }
                request.setAttribute("list", list);
                RequestDispatcher rd2 = request.getRequestDispatcher("Display.jsp");
                rd2.forward(request, response);

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
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Contr_Movie.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Contr_Movie.class.getName()).log(Level.SEVERE, null, ex);
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

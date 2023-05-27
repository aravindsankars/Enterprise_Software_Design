/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.edu.esd.controller;

import com.edu.esd.model.Model_Shop;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aravindsankars
 */
@WebServlet(name = "Contr_Shop", urlPatterns = {"/Contr_Shop"})
public class Contr_Shop extends HttpServlet {

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
        String a_header = request.getHeader("Authorization");
        if (a_header == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setHeader("WWW-Authenticate", "BASIC realm=\"Shopping\"");
        } else {
            String u_inf = a_header.substring(6).trim();
            String decodedInfo = Arrays.toString(Base64.getDecoder().decode(u_inf));
            byte[] decodedBytes = Base64.getDecoder().decode(u_inf);
            String[] creds = new String(decodedBytes, StandardCharsets.UTF_8).split(":");
            String userName = creds[0];
            String password = creds[1];

            if (Reverse(userName, password)) {
                // display HTML
                response.setContentType("text/html");
                List<Model_Shop> products = new ArrayList<>();
                HttpSession session = request.getSession();
                String qnum = request.getParameter("List1");

                if (qnum.equals("Laptop")) {
                    RequestDispatcher rd = request.getRequestDispatcher("Laptop.jsp");
                    rd.forward(request, response);
                } else if (qnum.equals("Phone")) {
                    RequestDispatcher rd = request.getRequestDispatcher("Phone.jsp");
                    rd.forward(request, response);

                } else if (qnum.equals("Tshirt")) {
                    RequestDispatcher rd = request.getRequestDispatcher("Tshirt.jsp");
                    rd.forward(request, response);
                } else if (qnum.equals("Cart")) {               
                    RequestDispatcher rd = request.getRequestDispatcher("Shop_Cart.jsp");
                    rd.forward(request, response);

                } else if (qnum.equals("Output")) {
                    //List<Items> key = (List<Items>) session.getAttribute("master_list");
                    String[] pro = request.getParameterValues("products");
                    List<Model_Shop> products2 = new ArrayList<>();
                    for (String in : pro){
                        Model_Shop ms = new Model_Shop();
                        ms.setItem(in);
                        products2.add(ms);
                    }
                     if (session.getAttribute("master_list") == null) {

                        session.setAttribute("master_list", products2);
                    }else {
                        products.clear();
                        products.addAll((List<Model_Shop>) session.getAttribute("master_list"));

                        for (Model_Shop prod : products2) {
                            products.add(prod);
                        }
                        session.setAttribute("master_list", products);
                    }
                     
                     session.setAttribute("newProd", products2);
                    
                     RequestDispatcher rd = request.getRequestDispatcher("Add.jsp");
                    rd.forward(request, response);
                    
                } else if(qnum.equals("Remove")){
                    List<String> temp1 = new ArrayList<>();
                     String[] pro1 = request.getParameterValues("elements");
                     temp1 = Arrays.asList(pro1);
                    products.clear();
                    products.addAll((List<Model_Shop>) session.getAttribute("master_list"));
                    List<Model_Shop> products2 = new ArrayList<>();
                     for (String in : temp1){
                        Model_Shop ms = new Model_Shop();
                        ms.setItem(in);
                        products2.add(ms);
                    }
                     
                    System.out.println(products);
                    System.out.println(products2);
                    products.removeAll(products2);
                     System.out.println(products);
                     session.setAttribute("remove", products2);
                     session.setAttribute("master_list", products);
                    RequestDispatcher rd = request.getRequestDispatcher("Remove.jsp");
                    rd.forward(request, response);
                }
            }
        }
    }

        private boolean Reverse(String s1, String s2) {
        s2 = (new StringBuffer(s2)).reverse().toString();
        return ((s1.length() > 0) && s1.equals(s2));
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

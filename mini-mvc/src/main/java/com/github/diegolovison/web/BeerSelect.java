package com.github.diegolovison.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.github.diegolovison.model.*;

public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        
        String color = request.getParameter("color");

        BeerExpert expert = new BeerExpert();
        List<String> styles = expert.getBrands(color);

        request.setAttribute("styles", styles);

        RequestDispatcher view =
            request.getRequestDispatcher("result.jsp");

        view.forward(request, response);
    }
    
}
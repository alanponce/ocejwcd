package com.github.diegolovison;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class LifeCycleServlet extends HttpServlet {

    public LifeCycleServlet() {
        log("contructor");
    }

    public void init(ServletConfig config) throws ServletException {
        log("before init");
        super.init(config);
        log("after init");
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log("before service");
        super.service(request, response);
        log("after service");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log("doGet");
        response.getWriter().println("hello my friend");
    }   

    public void log(String message) {
        System.out.println(message);
    }
    
}
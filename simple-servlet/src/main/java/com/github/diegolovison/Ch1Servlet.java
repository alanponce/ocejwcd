package com.github.diegolovison;

import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class Ch1Servlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        StringBuilder html = new StringBuilder();
        html.append("<html>");
            html.append("<body>");
                html.append("Today is: " + new Date());
                html.append("<br/>");
                html.append("Beer type: ").append(request.getParameter("select"));
            html.append("</body>");
        html.append("</html>");

        PrintWriter out = response.getWriter();
        out.println(html.toString());
    }
}
package com.github.diegolovison;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DownloadServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");


        InputStream input = this.getClass().getResourceAsStream("/welcome.txt");

        int read = 0;
        byte[] bytes = new byte[1024];

        OutputStream output = response.getOutputStream();
        while ((read = input.read(bytes)) != -1) {
            output.write(bytes, 0, read);
        }
        output.flush();
        output.close();

    }

}
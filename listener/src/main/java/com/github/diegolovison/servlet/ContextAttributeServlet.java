package com.github.diegolovison.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

public class ContextAttributeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		request.getServletContext().setAttribute("context name", "diego");
		request.getServletContext().setAttribute("context name", "foo");
		request.getServletContext().removeAttribute("context name");
	}
	
}
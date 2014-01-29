package com.github.diegolovison.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

public class RequestAttributeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		request.setAttribute("request name", "diego");
		request.setAttribute("request name", "foo");
		request.removeAttribute("request name");
	}
	
}
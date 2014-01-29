package com.github.diegolovison.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

public class SessionAttributeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		request.getSession().setAttribute("session name", "diego");
		request.getSession().setAttribute("session name", "foo");
		request.getSession().removeAttribute("session name");
	}
	
}
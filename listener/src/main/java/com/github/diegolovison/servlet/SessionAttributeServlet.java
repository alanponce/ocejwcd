package com.github.diegolovison.servlet;

import javax.servlet.*;
import javax.servlet.http.*;

import com.github.diegolovison.bind.BindingListener;

public class SessionAttributeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

    HttpSession httpSession = request.getSession();

		httpSession.setAttribute("session name", "diego");
		httpSession.setAttribute("session name", "foo");
		httpSession.removeAttribute("session name");

    httpSession.setAttribute("binding", new BindingListener(httpSession.getId()));
    httpSession.removeAttribute("binding");

    httpSession.invalidate();
	}
	
}
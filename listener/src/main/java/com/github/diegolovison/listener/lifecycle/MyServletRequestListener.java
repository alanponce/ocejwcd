package com.github.diegolovison.listener.lifecycle;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServletRequestListener implements ServletRequestListener {

	public void requestInitialized(ServletRequestEvent event) {
		
		ServletRequest servletRequest = event.getServletRequest();

		if (servletRequest instanceof HttpServletRequest) {
			
			HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

			log(httpServletRequest.getRemoteAddr() + " is accessing the following path: " + 
				httpServletRequest.getServletPath());
		}
	}

	public void requestDestroyed(ServletRequestEvent event) {

		ServletRequest servletRequest = event.getServletRequest();

		if (servletRequest instanceof HttpServletRequest) {
			
			HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

			log(httpServletRequest.getRemoteAddr() + " accessed the following path: " + 
				httpServletRequest.getServletPath());
		}
	}

	private void log(String message) {
		System.out.println(message);
	}
}
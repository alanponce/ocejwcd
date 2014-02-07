package com.github.diegolovison.listener.lifecycle;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServletContextListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent event) {

		log("# context destroyed");

	} 
        
 	public void contextInitialized(ServletContextEvent event) {

		log("# context initialized");
 	} 

 	private void log(String message) {
		System.out.println(message);
	}
	
}
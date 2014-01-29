package com.github.diegolovison.listener.attribute;

import javax.servlet.*;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {
	
	public void	attributeAdded(ServletContextAttributeEvent event) {

		log("context attribute added " + event.getName() + " with value " + event.getValue());
	}

	public void	attributeRemoved(ServletContextAttributeEvent event) {

		log("context attribute removed " + event.getName() + " with value " + event.getValue());
	}
     
    public void	attributeReplaced(ServletContextAttributeEvent event) {

		log("context attribute replaced " + event.getName() + " with value " + event.getValue());
    }

    private void log(String message) {
    	System.out.println(message);
    }
}
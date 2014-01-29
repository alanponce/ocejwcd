package com.github.diegolovison.listener.attribute;

import javax.servlet.*;

public class MyServletRequestAttibuteListener implements ServletRequestAttributeListener {
	
	public void	attributeAdded(ServletRequestAttributeEvent event) {

		log("request attribute added " + event.getName() + " with value " + event.getValue());
	}

	public void	attributeRemoved(ServletRequestAttributeEvent event) {

		log("request attribute removed " + event.getName() + " with value " + event.getValue());
	}
     
    public void	attributeReplaced(ServletRequestAttributeEvent event) {

		log("request attribute replaced " + event.getName() + " with value " + event.getValue());
    }

    private void log(String message) {
    	System.out.println(message);
    }
}
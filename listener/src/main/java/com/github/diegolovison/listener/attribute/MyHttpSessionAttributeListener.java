package com.github.diegolovison.listener.attribute;

import javax.servlet.http.*;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
	
	public void	attributeAdded(HttpSessionBindingEvent event) {

		log("session "+ event.getSession().getId() +" attribute added " + event.getName() + " with value " + event.getValue());
	}

	public void	attributeRemoved(HttpSessionBindingEvent event) {

		log("session "+ event.getSession().getId() +" attribute removed " + event.getName() + " with value " + event.getValue());
	}
     
    public void	attributeReplaced(HttpSessionBindingEvent event) {

		log("session "+ event.getSession().getId() +" attribute replaced " + event.getName() + " with value " + event.getValue());
    }

    private void log(String message) {
    	System.out.println(message);
    }
}
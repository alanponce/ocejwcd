package com.github.diegolovison.listener.lifecycle;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyHttpSessionListener implements HttpSessionListener {

  public void sessionCreated(HttpSessionEvent event) {

    log("session " + event.getSession().getId() + " created");
  } 
  
  public void sessionDestroyed(HttpSessionEvent event) {
    
    log("session " + event.getSession().getId() + " destroyed");
  }

  private void log(String message) {
    System.out.println(message);
  } 
  
}
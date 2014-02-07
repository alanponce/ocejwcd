package com.github.diegolovison.listener.lifecycle;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyHttpSessionActivationListener implements HttpSessionActivationListener {

  public void sessionDidActivate(HttpSessionEvent event) {

    log("session did activate: " + event.getSession().getId());
  } 
  
  public void sessionWillPassivate(HttpSessionEvent event) {
    
    log("session will passivate: " + event.getSession().getId());
  } 

  private void log(String message) {
    System.out.println(message);
  } 

}
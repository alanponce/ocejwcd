package com.github.diegolovison.listener.lifecycle;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyHttpSessionBindingListener implements HttpSessionBindingListener {
  
  public void valueBound(HttpSessionBindingEvent event) {

    log("http session binding bound: " + event.getValue());
  }
  
  public void valueUnbound(HttpSessionBindingEvent event) {

    log("http session binding unbound: " + event.getValue());
  }

  private void log(String message) {
    System.out.println(message);
  }

}
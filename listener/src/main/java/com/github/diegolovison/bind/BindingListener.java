package com.github.diegolovison.bind;

import javax.servlet.*;
import javax.servlet.http.*;

public class BindingListener implements HttpSessionBindingListener {

  private String httpSessionId;

  public BindingListener(String httpSessionId) {
    this.httpSessionId = httpSessionId;
  }

  public void valueBound(HttpSessionBindingEvent event) {

    log("http session binding bound: " + event.getValue());
  }
  
  public void valueUnbound(HttpSessionBindingEvent event) {

    log("http session binding unbound: " + event.getValue());
  }

  private void log(String message) {
    System.out.println(message);
  }

  public String toString() {
    return this.httpSessionId;
  }
  
}
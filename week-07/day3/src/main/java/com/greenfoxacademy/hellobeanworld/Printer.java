package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

  @Service
  public class Printer {
    public String log(String message) {
      return(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
  }

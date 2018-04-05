package com.greenfoxacademy.hellobeanworld;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

public class Printer {
  @Service
  public class Printer {
    public String log(String message) {
      System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
  }
}

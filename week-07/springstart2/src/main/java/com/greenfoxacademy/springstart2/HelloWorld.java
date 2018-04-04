package com.greenfoxacademy.springstart2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {

  @RequestMapping(value = "/hello")
  public String index() {
    return "Hello World!";
  }
}

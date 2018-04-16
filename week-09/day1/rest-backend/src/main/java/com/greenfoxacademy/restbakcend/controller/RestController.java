package com.greenfoxacademy.restbakcend.controller;

import com.greenfoxacademy.restbakcend.model.Doubling;
import com.greenfoxacademy.restbakcend.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping (value = "/doubling")
  public Object doubling(@RequestParam (value="input", required=false )Integer number){
    Doubling doubling = new Doubling(number);
    if(number != null) {
      return doubling;
    }else {
      return "input error";
    }
  }
  @GetMapping (value = "/greeter")
  public Object greeter(@RequestParam (value = "name") String name, @RequestParam (value = "title") String title){
    Greeting greeting = new Greeting(name, title);
    return greeting;
  }
}

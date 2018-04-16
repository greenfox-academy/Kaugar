package com.greenfoxacademy.restbakcend.controller;

import com.greenfoxacademy.restbakcend.model.Appenda;
import com.greenfoxacademy.restbakcend.model.Doubling;
import com.greenfoxacademy.restbakcend.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  Error error;

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
  public Object greeter(@RequestParam (value = "name", required = false) String name, @RequestParam (value = "title", required = false) String title){
    Greeting greeting = new Greeting(name, title);
    if(name != null || title != null){
      return greeting;
    } else {
      return error;
    }
  }
  @GetMapping(value = "/appenda/{appendable}")
  public Object appender(@PathVariable (value = "appendable") String word){
    Appenda appenda = new Appenda(word);
    return appenda;
  }
}

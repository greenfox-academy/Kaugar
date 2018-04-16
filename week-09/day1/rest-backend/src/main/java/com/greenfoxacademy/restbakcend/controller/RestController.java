package com.greenfoxacademy.restbakcend.controller;

import com.greenfoxacademy.restbakcend.model.Appenda;
import com.greenfoxacademy.restbakcend.model.Doubling;
import com.greenfoxacademy.restbakcend.model.DoUntil;
import com.greenfoxacademy.restbakcend.model.Greeting;
import org.springframework.web.bind.annotation.*;

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
  @PostMapping(value = "/dountil/{what}")
  public Object dountil(@PathVariable (value = "what") String operation, @RequestParam (value = "until") Integer number){
    DoUntil doUntil = new DoUntil(number,operation);
    return doUntil;
  }
}

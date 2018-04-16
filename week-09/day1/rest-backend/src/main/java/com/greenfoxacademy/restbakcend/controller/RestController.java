package com.greenfoxacademy.restbakcend.controller;

import com.greenfoxacademy.restbakcend.model.*;
import com.greenfoxacademy.restbakcend.model.Error;
import com.greenfoxacademy.restbakcend.services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @Autowired
  DoUntilService doUntilService;

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name != null && title != null) {
      return new Greeting(name, title);
    } else if (name != null && title == null) {
      return new Error("Please provide a title!");
    } else {
      return new Error("Please provide a name!");
    }
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object appender(@PathVariable(value = "appendable") String word) {
    Appenda appenda = new Appenda(word);
    return appenda;
  }

  @PostMapping(value = "/dountil/{what}")
  public Object doUntil(@PathVariable(name = "what", required = false) String operation, @RequestBody DoUntil doUntil) {
    if (doUntil != null && operation != null) {
      if (operation.equals("sum")) {
        return new DoUntilSum(doUntil.getUntil());
      } else if (operation.equals("factor")) {
        return new DoUntilFactor(doUntil.getUntil());
      }
    } else if(operation != null && doUntil == null){
      return new Error ("Please provide a number");
    }
    return new Error("Please provide a number");
  }
}
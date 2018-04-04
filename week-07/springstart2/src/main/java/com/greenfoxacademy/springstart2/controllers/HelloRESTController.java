package com.greenfoxacademy.springstart2.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloRESTController {

  @RequestMapping
  public Greeting greeting (@RequestParam String name){
    return new Greeting("Hello:" + name);
  }

}

package com.greenfoxacademy.resttest.controllers;


import com.greenfoxacademy.resttest.models.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {


  @GetMapping (value = "/groot")
  public Groot greetGroot(@RequestParam(value = "message", required = false) String somemessage){
    Groot groot = new Groot();
    if (somemessage != null){
      groot.setReceived(somemessage);
      groot.setTranslated("I am groot");
    } else {
      groot.setError("I am groot");
    }
    return groot;
  }


}

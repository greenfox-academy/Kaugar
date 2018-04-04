package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

  @RequestMapping (value = "/show")
  public BankAccount bankAccount (){
    return new BankAccount("Simba", 2000, "lion");
  }
}

package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {


  @RequestMapping (value = "/show")
  public String bankAccount (Model model){
    model.addAttribute(new BankAccount("Simba", 2000, "lion"));
    return "bankaccountvalues";

  }
}

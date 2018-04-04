package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {
  BankAccount account;


  @GetMapping(value = "/show")
  public String bankAccount (Model model){
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
    return "show";

  }

}

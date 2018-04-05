package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowController {
  BankAccount account;
  Bank bank = new Bank();


  @GetMapping(value = "/show")
  public String bankAccount (Model model){
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
    return "show";

  }

  @GetMapping(value = "/enjoy")
  public String enjoyhtml (Model model){
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "enjoy";
  }

  @GetMapping(value = "/bank")
  public String Bank (Model model){
    model.addAttribute("bank", bank.getAccounts());
    return "bank";
  }
  public class accountCreator {
    @RequestMapping(value = "/newaccount", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute BankAccount bankAccount, BindingResult errors, Model model) {
      return "bank";
    }
  }
}

package com.greenfoxacademy.hellobeanworld.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping(value = "/useful")
  public String link (Model model){
    model.addAttribute("utilities", "Colored Background");
    return "useful";

  }

  @GetMapping(value = "/useful/colored")
  public String bankAccount (Model model){
    model.addAttribute("colored", "hello");
    return "colored";

  }
}

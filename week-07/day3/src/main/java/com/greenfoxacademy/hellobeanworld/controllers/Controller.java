package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

  @Autowired
  UtilityService utilityService;

  @GetMapping(value = "/useful")
  public String link (Model model){
    model.addAttribute("utilities", "Colored Background");
    return "useful";

  }

  @GetMapping(value = "/useful/colored")
  public String pagewithrandombackground (Model model){
    model.addAttribute("randomcolor", utilityService.randomColor());
    return "colored";

  }
}

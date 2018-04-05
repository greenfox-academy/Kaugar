package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
  public String pageWithRandomBackground (Model model){
    model.addAttribute("randomcolor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping(value="/useful/email")
  public String email (Model model, @RequestParam(name = "email") String emailToCheck) {
    model.addAttribute("isValid", utilityService.validateEmail(emailToCheck));
    model.addAttribute("email", emailToCheck);
    return "email";
  }


}

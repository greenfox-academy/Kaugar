package com.greenfoxacademy.hellobeanworld.controllers;

import com.greenfoxacademy.hellobeanworld.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

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
    model.addAttribute("emailToCheckBack", emailToCheck);
    return "email";
  }

  @GetMapping(value = "/useful/caesar")
  public String caesarForm (Model model) {
    return "caesar";
  }

  @PostMapping(value = "useful/caesar")
  public String caesarEncoder (@ModelAttribute(name = "textToEncode") String text, Model model,
                               @ModelAttribute(name= "number") String numberstr ) {
    try{
      Integer number = Integer.parseInt(numberstr);
      model.addAttribute("encodedText", utilityService.caesar(text, number));
      return "caesar";
    }catch (NumberFormatException e){
      return "redirect:/useful/caesar";
    }
  }
}

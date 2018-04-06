package com.greenfoxacademy.programmerfoxclub.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class MainController {

  @GetMapping(value = "/")
  public String link (){
    return "index";
  }
  @GetMapping(value = "/login")
  public String login (Model model) {
    return "login";
  }

  @PostMapping(value = "login")
  public String getLoginName (@ModelAttribute(name = "nameOfPet") String text, Model model){
    model.addAttribute("encodedText", utilityService.caesar(text,number));
    return "login";
  }

}

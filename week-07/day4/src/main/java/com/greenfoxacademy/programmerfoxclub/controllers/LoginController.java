package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class LoginController {

  @GetMapping(value = "/login")
  public String login (Model model) {
    return "login";
  }

  @PostMapping(value = "/login")
  public String getLoginName (@ModelAttribute(name = "nameOfPet") String text, Model model){
    Fox fox = new Fox(text);
    return "redirect:/?nameOfPet=" + text;
  }
}

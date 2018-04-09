package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.database.FoxDb;
import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class MainController {

  Fox fox;
  @Autowired
  FoxDb foxDb;

  @GetMapping(value = "/")
  public String link(@RequestParam(name = "nameOfPet", required = false) String nameOfPet, Model model) {
    fox = new Fox(nameOfPet);
    foxDb.addFox(fox);
    model.addAttribute("nameOfPet", fox.getName());
    return "index";
  }

  @GetMapping(value = "/login")
  public String login() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String getLoginName(@ModelAttribute(name = "nameOfPet") String text, Model model) {
    model.addAttribute("nameOfPet", text);
    return "redirect:/?nameOfPet=" + text;
  }


}

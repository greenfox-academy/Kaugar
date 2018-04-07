package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class MainController {

  @Autowired
  Fox fox;

  @GetMapping(value = "/")
  public String link (@RequestParam(name = "nameOfPet", required = false) String nameOfPet, Model model){
    model.addAttribute("nameOfPet", fox.getName());
    return "index";
  }



}

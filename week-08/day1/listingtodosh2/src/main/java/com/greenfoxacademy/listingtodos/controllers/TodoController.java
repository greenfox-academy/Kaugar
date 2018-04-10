package com.greenfoxacademy.listingtodos.controllers;

import com.greenfoxacademy.listingtodos.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoInterface todoInterface;

  @GetMapping(value = "/todo")
  public String todo() {
    return "todo";
  }
  @GetMapping(value ={ "/", "/list"})
  @ResponseBody
  public String list (Model model){
    return "This is my first todo";
  }
}

package com.greenfoxacademy.todolistwithmsql.controllers;


import com.greenfoxacademy.todolistwithmsql.repository.TodoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoInterface todoInterface;

  @GetMapping(value = "/todo")
  public String todo(Model model, @RequestParam (name = "isActive", required = false) Boolean isDone ){
    if(isDone == null){
      model.addAttribute("todos", todoInterface.findAll());
    } else {
      model.addAttribute("todos", todoInterface.findBydone(!isDone));
    }
    return "todoslist";
  }


  @GetMapping(value ={ "/", "/list"})
  @ResponseBody
  public String list (Model model){
    return "This is my first todo";
  }
}

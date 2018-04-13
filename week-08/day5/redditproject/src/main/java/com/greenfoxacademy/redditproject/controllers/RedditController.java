package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedditController {

  @Autowired
  PostRepository postRepository;

  @GetMapping(value = "/reddit")
  public String todo(Model model){
    model.addAttribute("posts", postRepository.findAll());
    return "homepage";
  }

}

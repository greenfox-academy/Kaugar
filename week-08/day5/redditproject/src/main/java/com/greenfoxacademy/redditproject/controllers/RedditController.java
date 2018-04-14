package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

  @Autowired
  PostRepository postRepository;

  @GetMapping(value = "/reddit")
  public String reddit(Model model){
    model.addAttribute("posts", postRepository.findAll());
    return "homepage";
  }
  @GetMapping(value = "/newpost")
  public String newpost(Model model){
    model.addAttribute("post", new Post());
    return "newpostpage";
  }
  @PostMapping(value = "/newpost")
  public String newpostpost(Post newpost){
    postRepository.save(newpost);
    return "redirect:/reddit";
  }
  @GetMapping(value = "/{id}/voteup")
  public String voteUp(@PathVariable(name = "id") Long id) {
    postRepository.findById(id).get().setVote(+1);
    return "redirect:/reddit";
  }
  @GetMapping(value = "/{id}/votedown")
  public String votedown(@PathVariable(name = "id") Long id) {
    postRepository.findById(id).get().setVote(-1);
    return "redirect:/reddit";
  }

}

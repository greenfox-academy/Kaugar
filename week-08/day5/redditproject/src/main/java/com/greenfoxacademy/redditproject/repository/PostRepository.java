package com.greenfoxacademy.redditproject.repository;

import com.greenfoxacademy.redditproject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
  
}

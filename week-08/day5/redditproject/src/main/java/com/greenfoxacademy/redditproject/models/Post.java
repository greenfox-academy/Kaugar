package com.greenfoxacademy.redditproject.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Post {
  @GeneratedValue (strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private String url;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public Post() {
  }

}

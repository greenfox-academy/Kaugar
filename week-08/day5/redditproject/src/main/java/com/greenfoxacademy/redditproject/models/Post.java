package com.greenfoxacademy.redditproject.models;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;


@Entity
public class Post {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String url;
  private int vote;
  private LocalDateTime createdAt;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.createdAt = now();
  }

  public Post() {
    this.createdAt = now();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public void voteUp(){
    this.vote++;
  }

  public void voteDown(){
    if(this.vote > 0){
      this.vote--;
    }
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }
}

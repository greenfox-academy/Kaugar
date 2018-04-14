package com.greenfoxacademy.redditproject.models;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Post {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String url;
  private int vote;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    vote = 0;
  }

  public Post() {
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
}

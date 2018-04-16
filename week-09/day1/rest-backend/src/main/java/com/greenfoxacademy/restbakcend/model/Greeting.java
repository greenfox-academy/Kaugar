package com.greenfoxacademy.restbakcend.model;

public class Greeting {
  String name;
  String title;

  public Greeting(String name, String title) {
    String greeting = "Hi there" + name;
    this.name = name;
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}

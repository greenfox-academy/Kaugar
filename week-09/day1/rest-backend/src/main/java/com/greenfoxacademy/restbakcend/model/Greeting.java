package com.greenfoxacademy.restbakcend.model;

public class Greeting {
  String welcome_message;
  String error;

  public Greeting(String name, String title) {
    this.welcome_message = "Hi there " + name + " my dear " + title;
  }

  public Greeting() {
    this.error = "Please provide a name";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}

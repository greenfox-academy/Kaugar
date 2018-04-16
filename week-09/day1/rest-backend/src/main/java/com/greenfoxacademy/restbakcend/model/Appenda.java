package com.greenfoxacademy.restbakcend.model;

public class Appenda {

  String appended;

  public Appenda(String word) {
    this.appended = word + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}

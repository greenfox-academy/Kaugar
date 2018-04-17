package com.greenfoxacademy.resttest.models;

public class Groot {

  private String received;
  private String translated;
  private String error;

  public Groot(String received) {
    this.received = received;
    translated = "I am groot";
  }

  public Groot() {
    error = "I am groot";
  }


  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

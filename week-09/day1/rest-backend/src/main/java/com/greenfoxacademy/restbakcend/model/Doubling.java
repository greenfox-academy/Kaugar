package com.greenfoxacademy.restbakcend.model;

public class Doubling {

  int received;
  int result;

  public Doubling(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public Doubling() {
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

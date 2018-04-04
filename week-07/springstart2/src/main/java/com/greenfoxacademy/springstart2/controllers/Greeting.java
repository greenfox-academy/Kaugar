package com.greenfoxacademy.springstart2.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  AtomicLong id;
  String content;


  public Greeting(AtomicLong id, String content) {
    this.id = id;
    this.content = content;
  }
  public Greeting(String content) {
    this.content = content;
  }

  public AtomicLong getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}

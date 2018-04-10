package com.greenfoxacademy.listingtodos.models;

public class Todo {

  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(String title) {
    this.title = title;
    urgent = false;
    done = false;
  }
}

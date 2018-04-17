package com.greenfoxacademy.resttest.models;

public class Errormsg {
  private String error;

  public Errormsg(String error) {
    this.error = error;
  }

  public Errormsg() {
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}

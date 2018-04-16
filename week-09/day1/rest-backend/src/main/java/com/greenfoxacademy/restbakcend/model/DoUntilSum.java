package com.greenfoxacademy.restbakcend.model;

public class DoUntilSum {
  private Integer result = 0;

  public DoUntilSum(Integer until) {
      for (int i = 1; i <= until; i++) {
        this.result += i;
      }
  }

  public DoUntilSum() {
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}

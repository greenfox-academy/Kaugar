package com.greenfoxacademy.restbakcend.model;

public class DoUntilFactor {
  private Integer result = 1;

  public DoUntilFactor(Integer until) {
    for (int i = 1; i <= until; i++) {
      this.result *= i;
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}

package com.greenfoxacademy.restbakcend.model;

public class DoUntil {
  Integer result;

  public DoUntil(int until, String operation) {
    this.result = 0;
    if (operation.equals("sum")){
      for (int i = 1; i <= until; i++) {
        this.result += i;
      }
    }else if (operation.equals("factor")){
      for (int i = 0; i < until; i++) {
        this.result *= i;
      }
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}

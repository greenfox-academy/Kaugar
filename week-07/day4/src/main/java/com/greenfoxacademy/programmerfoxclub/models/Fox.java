package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public class Fox {

  private String name;
  private ArrayList<String> tricks;
  private String food;
  private String drink;

  public Fox(String name) {
    this.name = name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

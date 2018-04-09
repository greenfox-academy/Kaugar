package com.greenfoxacademy.programmerfoxclub.database;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class FoxDb {

  public ArrayList<Fox> foxList;

  public FoxDb() {
    foxList = new ArrayList<>();
  }

  public void addFox (Fox fox){
    foxList.add(fox);
  }

  public String getFox(String name){
    String foxName = "";
    for (int i = 0; i <foxList.size(); i++) {

    }
    return null;
  }

  public ArrayList<Fox> getFoxList() {
    return foxList;
  }
}

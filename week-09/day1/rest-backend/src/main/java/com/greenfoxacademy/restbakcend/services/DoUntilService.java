package com.greenfoxacademy.restbakcend.services;

import com.greenfoxacademy.restbakcend.model.DoUntil;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {


  public Object sum (Integer until) {
    Integer result = 0;
    for (int i = 1; i <= until; i++) {
      result += i;
    }
    return new DoUntil(result);
  }
}

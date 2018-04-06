package com.greenfoxacademy.programmerfoxclub.Services;


import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  Fox login(String username);
  Fox getUser(String username);

}

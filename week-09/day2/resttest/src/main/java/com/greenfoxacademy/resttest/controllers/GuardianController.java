package com.greenfoxacademy.resttest.controllers;


import com.greenfoxacademy.resttest.models.Cargo;
import com.greenfoxacademy.resttest.models.Errormsg;
import com.greenfoxacademy.resttest.models.Groot;
import com.greenfoxacademy.resttest.models.Yondu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {


  @GetMapping (value = "/groot")
  public Groot greetGroot(@RequestParam(value = "message", required = false) String somemessage){
    if (somemessage != null){
      return new Groot(somemessage);
    } else {
      return new Groot();
    }
  }

  @GetMapping (value = "/yondu")
  public Object yondu(@RequestParam(value = "distance", required = false) Double distance,
                     @RequestParam(value = "time", required = false) Double time){
    if (distance != null && time != null){
      return new Yondu(distance,time);
    } else {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errormsg("Error"));
    }
  }

  @GetMapping (value = "/rocket")
  public Cargo cargo(){
    return new Cargo();
  }


}

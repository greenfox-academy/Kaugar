package com.greenfoxacademy.resttest.controllers;

import com.greenfoxacademy.resttest.ResttestApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ResttestApplication.class)
@WebAppConfiguration
@EnableWebMvc
@AutoConfigureMockMvc

public class GuardianControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;


  @Test
  public void greetGroot() throws Exception {
    mockMvc.perform(get("/groot")
            .param("message", "somemessage"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.translated").value("I am groot"))
            .andExpect(jsonPath("$.received").value("somemessage"));
  }

  @Test
  public void greetGrootError() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("I am groot"));
  }

  @Test
  public void yonduTest() throws Exception {
    mockMvc.perform(get("/yondu")
            .param("distance", "100.0")
            .param("time", "10"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.distance").value(100.0))
            .andExpect(jsonPath("$.time").value(10.0))
            .andExpect(jsonPath("$.speed").value(10.0));
  }

  @Test
  public void yonduTestError() throws Exception {
    mockMvc.perform(get("/yondu")
            .param("time", "10"))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error").value("Error"));
  }

}
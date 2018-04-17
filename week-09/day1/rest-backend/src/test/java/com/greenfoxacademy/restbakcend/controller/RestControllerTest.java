package com.greenfoxacademy.restbakcend.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest //(classes = RestBakcendApplicationTests.class)
@WebAppConfiguration
@EnableWebMvc
@AutoConfigureMockMvc
public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void doUntilFactorIs15() throws Exception {
    mockMvc
            .perform(post("/dountil/factor")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(120));
  }

  @Test
  public void doUntilSumIs15() throws Exception {
    mockMvc
            .perform(post("/dountil/sum")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(15));
  }
  @Test
  public void doubleTest() throws Exception {
    mockMvc.perform(get("/doubling")
                    .param("input","5"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value(10));
  }
  @Test
  public void doubleTestError() throws Exception {
    mockMvc.perform(get("/doubling")
            .param("input",""))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an input!"));
  }
  @Test
  public void appendaTest() throws Exception {
    mockMvc.perform(get("/appenda/kuty"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("kutya"));
  }
  @Test
  public void greeterTest() throws Exception {
    mockMvc.perform(get("/greeter")
            .param("name","Peti")
            .param("title","student"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Peti, my dear student!"));
  }
}
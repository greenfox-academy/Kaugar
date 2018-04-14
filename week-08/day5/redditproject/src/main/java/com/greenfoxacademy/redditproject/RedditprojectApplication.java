package com.greenfoxacademy.redditproject;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditprojectApplication implements CommandLineRunner {
	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}

package com.sjtu.ladder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootWordLadder3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWordLadder3Application.class, args);
	}
}

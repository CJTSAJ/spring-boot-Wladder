package com.sjtu.ladder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}

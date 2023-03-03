package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello -----------  Home Page   -------------- " ;
	}

	@GetMapping("/search")
	public String search() {
		return "Hello -----------  Search Page   -------------- " ;
	}

	@GetMapping("/about")
	public String about() {
		return "Hello -----------  about Page   -------------- " ;
	}
}

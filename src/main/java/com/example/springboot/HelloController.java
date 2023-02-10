package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${location:local}")
    String location;

	@GetMapping("/")
	public String index() {
        String message= String.format("Hello from Spring Boot Keybank in %s!", location);
		return message;
	}

}

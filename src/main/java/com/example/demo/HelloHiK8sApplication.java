package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHiK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHiK8sApplication.class, args);
	}
	
	@GetMapping("hello")
	public String hello() {
		return helloMessage;
	}
	
	@GetMapping("hi")
	public String hi() {
		return hiMessage;
	}
	
	@Value("${hello.message}")
	private String helloMessage;
	
	@Value("${hi.message}")
	private String hiMessage;

}

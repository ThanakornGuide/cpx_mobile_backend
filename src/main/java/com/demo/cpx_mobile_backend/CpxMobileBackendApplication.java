package com.demo.cpx_mobile_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.cpx_mobile_backend.Controller.testoutput;

@SpringBootApplication
@RestController
public class CpxMobileBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpxMobileBackendApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}

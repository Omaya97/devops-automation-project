package com.DevopsIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

	@GetMapping
	public String message(){
		return "welcome to Devops Integration Application";
	}

	public static void main(String[] args) {
		System.out.println("Hello Devops Integration Application");
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}

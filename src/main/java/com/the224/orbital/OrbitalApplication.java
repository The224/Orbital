package com.the224.orbital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrbitalApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(OrbitalApplication.class);
		app.run(args);
	}

}

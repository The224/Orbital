package com.the224.orbital;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrbitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrbitalApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializer() {
		System.out.println("test");
		return (args) -> {};
	}

}

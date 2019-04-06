package com.the224.orbital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class OrbitalApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(OrbitalApplication.class);
		Properties properties = new Properties();

		if (args.length == 1) {
			properties.setProperty("spring.resources.static-locations", args[0]);
		}

		app.setDefaultProperties(properties);
		app.run(args);
	}

}

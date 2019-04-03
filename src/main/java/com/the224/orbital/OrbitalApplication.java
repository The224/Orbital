package com.the224.orbital;

import com.the224.orbital.controller.FileController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = FileController.class)
public class OrbitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrbitalApplication.class, args);
	}


}

package com.example.fxjavaProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FxJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxJavaProjectApplication.class, args);

		

	}
}

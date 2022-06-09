package com.example.fxjavaProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.ArrayList;



@SpringBootApplication
@CrossOrigin
public class FxJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxJavaProjectApplication.class, args);

		CreatePriceFeed newPriceFeed = new CreatePriceFeed();
		ArrayList<Price> feed = newPriceFeed.createPriceFeed();

	}
}

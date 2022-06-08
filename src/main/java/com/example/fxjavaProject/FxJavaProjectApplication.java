package com.example.fxjavaProject;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FxJavaProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FxJavaProjectApplication.class, args);

		CreatePriceFeed newPriceFeed = new CreatePriceFeed();
			List<Price> feed = newPriceFeed.createPriceFeed();


		for (Price date: feed
			 ) {



		}

		// List input
		List<Integer> arrayList
				= Arrays.asList(5, 3, 15, 234, 114, 1540);

		// Create maxValue variable and initialize with 0
		int maxValue = 0;

		// Check maximum element using for loop
		for (Integer integer : arrayList) {
			if (integer > maxValue)
				maxValue = integer;
		}
		System.out.println("The maximum value is "
				+ maxValue);







	}
}

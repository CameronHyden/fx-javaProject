package com.example.fxjavaProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;
import static java.util.Comparator.comparing;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FxJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxJavaProjectApplication.class, args);

		CreatePriceFeed newPriceFeed = new CreatePriceFeed();
		ArrayList<Price> feed = newPriceFeed.createPriceFeed();






//				ArrayList<Price> soredFeed = (ArrayList<Price>) feed.stream().sorted();
//				System.out.println(soredFeed);










	}
}

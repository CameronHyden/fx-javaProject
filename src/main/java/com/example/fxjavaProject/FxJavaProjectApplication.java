package com.example.fxjavaProject;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FxJavaProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FxJavaProjectApplication.class, args);



		List<Price> priceFeed = ReadFxCSV.createPriceArray("src/main/Data/fx-data.csv");

		CommissionService test1 = new CommissionService();
		test1.applyBidCommission(priceFeed);
		test1.applyAskCommission(priceFeed);
		System.out.println(priceFeed);

	}
}

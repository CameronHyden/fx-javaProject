package com.example.fxjavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class FxJavaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FxJavaProjectApplication.class, args);
		Price price1 = new Price(1,"GBP/USD",1.2499, 1.2596);
		Price price2 = new Price(2,"EUR/JPY", 119.61,119.91);

		ArrayList<Price> priceFeed1 = new ArrayList<>();
		priceFeed1.add(price1);
		priceFeed1.add(price2);

		CommissionService test1 = new CommissionService();
		test1.applyBidCommission(priceFeed1);
		test1.applyAskCommission(priceFeed1);
		System.out.println(priceFeed1);

	}
}

package com.example.fxjavaProject;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


import java.util.List;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FxJavaProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FxJavaProjectApplication.class, args);

		CreatePriceFeed newPriceFeed = new CreatePriceFeed();
			List<Price> feed = newPriceFeed.createPriceFeed();
		System.out.println(feed);

		for (Price date: feed) {
			String s = date.getDateCreated();
			long l=Long.parseLong(s);
			System.out.println(l);
			}



//		long maxValue = 0;
//		for (Price date: feed
//			 ) {
//			long n = date.getDateCreated();
//			if(n > maxValue){
//				maxValue = n;
//			}
//			System.out.println(n);
//		}

	}
}

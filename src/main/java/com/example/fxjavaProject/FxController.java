package com.example.fxjavaProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FxController {

    CreatePriceFeed newPriceFeed = new CreatePriceFeed();

    @GetMapping("/FX")
    public List<Price> FXTest(){
        return newPriceFeed.createPriceFeed();

    }
    @GetMapping("/FXDate")
    public List<Price> FXTestDate(){
        List<Price> feed = newPriceFeed.createPriceFeed();
        String[] Array = new String[feed.size()];
        feed.toArray(Array);
        return feed;
    }
}

//    public static double arrayMax(double[] arr) {
//        double max = Double.NEGATIVE_INFINITY;
//
//        for(double cur: arr)
//            max = Math.max(max, cur);
//
//        return max;
//    }

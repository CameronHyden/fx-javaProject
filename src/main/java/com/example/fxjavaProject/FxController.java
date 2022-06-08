package com.example.fxjavaProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;


@RestController
public class FxController {

    CreatePriceFeed newPriceFeed = new CreatePriceFeed();
    List<Price> FXPriceFeed = newPriceFeed.createPriceFeed();

    @GetMapping("/FX")
    public List<Price> FXTest(){
        return FXPriceFeed;

    }
    @GetMapping("/FX/{name}")
    public Price FXTest(@PathVariable String name){
        for (Price FXName: FXPriceFeed) {
                if (FXName.getName() == name);
                return FXName;
            }
        return null;
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

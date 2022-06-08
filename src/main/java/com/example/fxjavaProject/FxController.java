package com.example.fxjavaProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Comparator.comparing;


@RestController
public class FxController {

    CreatePriceFeed newPriceFeed = new CreatePriceFeed();
    ArrayList<Price> FXPriceFeed = newPriceFeed.createPriceFeed();

    @GetMapping("/FX")
    public ArrayList<Price> FXTest(){
        return FXPriceFeed;

    }
    @GetMapping("/FX/{id}")
    public Price FXTest(@PathVariable String id){
        for (Price FXName: FXPriceFeed) {
                if (FXName.getId() == parseInt(id));
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
    @GetMapping("/FXLatest")
    public Price getLatestPrice() {
        List<Price> feed = newPriceFeed.createPriceFeed();
        Price latest = feed.stream().max(comparing(Price::getId)).get();
        return latest;


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

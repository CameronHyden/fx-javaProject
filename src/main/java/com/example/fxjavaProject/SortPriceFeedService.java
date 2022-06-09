package com.example.fxjavaProject;

import java.util.ArrayList;
import java.util.Comparator;

public class SortPriceFeedService {
    public ArrayList<Price> sortPriceFeed(ArrayList<Price> prices){
                prices.sort(Comparator.comparingInt(Price::getId).reversed());
                return prices;
    }
}

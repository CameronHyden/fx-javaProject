package com.example.fxjavaProject;


import java.util.ArrayList;

public class FXPriceFeed {
    private ArrayList<Price> priceFeed;

    public FXPriceFeed(ArrayList<Price> priceFeed) {
        this.priceFeed = priceFeed;
    }

    public ArrayList<Price> getPriceFeed() {
        return priceFeed;
    }

    public void setPriceFeed(ArrayList<Price> priceFeed) {
        this.priceFeed = priceFeed;
    }

    @Override
    public String toString() {
        return "FXPriceFeed{" + priceFeed +
                '}';
    }
}
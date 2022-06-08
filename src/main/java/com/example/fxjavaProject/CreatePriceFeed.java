package com.example.fxjavaProject;

import java.util.ArrayList;

public class CreatePriceFeed {

    public ArrayList<Price>createPriceFeed(){
        ArrayList<Price> priceFeed = ReadFxCSV.createPriceArray("src/main/Data/fx-data.csv");
        CommissionService test1 = new CommissionService();
        test1.applyBidCommission(priceFeed, 0.001);
        test1.applyAskCommission(priceFeed, 0.001);
        return priceFeed;
    }
}

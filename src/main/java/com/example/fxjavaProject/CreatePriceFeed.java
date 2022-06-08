package com.example.fxjavaProject;

import java.util.List;

public class CreatePriceFeed {

    public List<Price>createPriceFeed(){
        List<Price> priceFeed = ReadFxCSV.createPriceArray("src/main/Data/fx-data.csv");
        CommissionService test1 = new CommissionService();
        test1.applyBidCommission(priceFeed, 0.001);
        test1.applyAskCommission(priceFeed, 0.001);
        return priceFeed;
    }
}

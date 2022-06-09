package com.example.fxjavaProject;

import java.util.ArrayList;

public class CreatePriceFeed {

    public ArrayList<Price>createPriceFeed(){
        ArrayList<Price> priceFeed = ReadFxCSV.createPriceArray("src/main/Data/fx-data.csv");
        CommissionService commissionService = new CommissionService();
        commissionService.applyBidCommission(priceFeed, 0.001);
        commissionService.applyAskCommission(priceFeed, 0.001);
        return priceFeed;
    }
}

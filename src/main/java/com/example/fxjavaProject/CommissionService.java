package com.example.fxjavaProject;


import java.util.ArrayList;


public class CommissionService {
    public ArrayList<Price> applyAskCommission(ArrayList<Price> prices, double commission){
        prices.forEach(p -> p.setAsk(p.getAsk() * commission + p.getAsk()));
        return prices;
    }

    public ArrayList<Price> applyBidCommission(ArrayList<Price>  prices , double commission){

        prices.forEach(p -> p.setBid(p.getBid() - p.getBid() * commission));
        return prices;

    }

}

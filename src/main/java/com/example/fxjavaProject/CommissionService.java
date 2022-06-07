package com.example.fxjavaProject;


import java.util.List;

public class CommissionService {
    public void applyAskCommission(List<Price> prices){
        prices.forEach(p -> p.setAsk(p.getAsk() * 0.001 + p.getAsk()));
    }

    public void applyBidCommission(List<Price> prices){

        prices.forEach(p -> p.setBid(p.getBid() - p.getBid() * 0.001));

    }

}

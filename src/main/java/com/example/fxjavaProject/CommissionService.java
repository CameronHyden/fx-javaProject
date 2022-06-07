package com.example.fxjavaProject;

import java.util.ArrayList;

public class CommissionService {
    public void applyAskCommission(ArrayList<Price> prices){
        prices.forEach(p -> p.setAsk(p.getAsk() * 0.001 + p.getAsk()));
    }

    public void applyBidCommission(ArrayList<Price> prices){

        prices.forEach(p -> p.setBid(p.getBid() - p.getBid() * 0.001));

    }
}

package com.example.fxjavaProject;


import java.util.List;

public class CommissionService {
    public List<Price> applyAskCommission(List<Price> prices, double commission){
        prices.forEach(p -> p.setAsk(p.getAsk() * commission + p.getAsk()));
        return prices;
    }

    public List<Price>applyBidCommission(List<Price> prices , double commission){

        prices.forEach(p -> p.setBid(p.getBid() - p.getBid() * commission));
        return prices;

    }

}

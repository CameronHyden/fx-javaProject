package com.example.fxjavaProject;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class CommissionServiceTest {

    public CommissionService commissionService;
    ArrayList<Price> testPriceFeed = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        commissionService = new CommissionService();
        Price testPrice = new Price(1,"GBP/USD",1.2499, 1.2596,"01-06-2020 12:01:01:001");
        testPriceFeed.add(testPrice);
    }
    @Test
    public void testAskCommission(){
        ArrayList<Price> expected = testPriceFeed;
        assertEquals("ask price should be increased by 0.1% in commission",
                commissionService.applyAskCommission(testPriceFeed, 0.001),
                expected);
    }
    @Test
    public void testBidCommission(){
        ArrayList<Price> expected = testPriceFeed;
        assertEquals("bid price should decrease by 0.1% in commission",
                commissionService.applyBidCommission(testPriceFeed, 0.001),
                expected);

    }

}
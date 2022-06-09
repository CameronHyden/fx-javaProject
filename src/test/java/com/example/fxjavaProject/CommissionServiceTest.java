package com.example.fxjavaProject;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;



public class CommissionServiceTest {

    public CommissionService commissionService;
    ArrayList<Price> testFeed = new ArrayList<>();



    @Before
    public void setUp() throws Exception {
        commissionService = new CommissionService();
        Price testPrice = new Price(1,"GBP/USD",1.1000, 1.2000,"01-06-2020 12:01:01:001");
        testFeed.add(testPrice);
    }
    @Test
    public void testAskCommission(){

        assertEquals("ask price should be increased by 0.1% in commission",
                commissionService.applyAskCommission(testFeed, 0.001),
                testFeed);
        System.out.println(testFeed);
    }
    @Test
    public void testBidCommission(){

        assertEquals("bid price should decrease by 0.1% in commission",
                commissionService.applyBidCommission(testFeed, 0.001),
              testFeed);

    }


}
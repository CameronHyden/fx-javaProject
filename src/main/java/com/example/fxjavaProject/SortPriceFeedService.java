package com.example.fxjavaProject;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;

@Service
public class SortPriceFeedService {
    public List<Price> sortPriceFeed(List<Price> prices){
                prices.sort(Comparator.comparingInt(Price::getId).reversed());
                return prices;
    }
}

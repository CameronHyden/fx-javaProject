package com.example.fxjavaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Comparator.comparing;


@RestController
public class FxController {

    @Autowired
    PriceRepository repository;

    CreatePriceFeed newPriceFeed = new CreatePriceFeed();
    ArrayList<Price> FXPriceFeed = newPriceFeed.createPriceFeed();

    @GetMapping("/FX")
    public List<Price> FXTest(){
        return FXPriceFeed;

    }
    @GetMapping("/FX/{id}")
    public Price FXTest(@PathVariable String id){
        for (Price FXName: FXPriceFeed) {
                if (FXName.getId() == parseInt(id));
                return FXName;
            }
        return null;
        }
        
    @GetMapping("/FXLatest")
    public Price getLatestPrice() {
        List<Price> feed = repository.findAll();
        Price latest = feed.stream().max(comparing(Price::getId)).get();

        return latest;

    }
    @PostMapping("/addPrice")
    public ResponseEntity<String> updateData(@RequestBody Price price) {
        repository.save(price);
        return ResponseEntity.status(HttpStatus.CREATED).body("Price added");
    }
}



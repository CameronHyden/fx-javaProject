package com.example.fxjavaProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static java.lang.Integer.parseInt;
import static java.util.Comparator.comparing;


@RestController
public class FxController {
    @Autowired
    SortPriceFeedService sortPriceFeedService;


    @Autowired
    PriceRepository repository;


    @GetMapping("/FX")
    public ResponseEntity<List<Price>> GetPriceFeed(){
       return ResponseEntity.status(HttpStatus.OK).body(sortPriceFeedService.sortPriceFeed(repository.findAll()));

    }
    @GetMapping("/FX/{id}")
    public ResponseEntity<Price> GetPriceById(@PathVariable String id){
        for (Price price: repository.findAll()) {
                if (price.getId() == parseInt(id)){
            return ResponseEntity.status(HttpStatus.OK).body(price);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @GetMapping("/FXLatest")
    public ResponseEntity<Price> getLatestPrice() {
        List<Price> feed = repository.findAll();
        Price latest = feed.stream().max(comparing(Price::getId)).get();
        return ResponseEntity.status(HttpStatus.OK).body(latest);

    }
    @PostMapping("/addPrice")
    public ResponseEntity<String> updateData(@RequestBody Price price) {
        repository.save(price);
        return ResponseEntity.status(HttpStatus.CREATED).body("Price added");
    }
}



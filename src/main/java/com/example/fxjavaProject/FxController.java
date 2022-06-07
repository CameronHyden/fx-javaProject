package com.example.fxjavaProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FxController {

    CreatePriceFeed newPriceFeed = new CreatePriceFeed();

    @GetMapping("/FX")
    public List<Price> FXTest(){
        return newPriceFeed.createPriceFeed();

    }
}

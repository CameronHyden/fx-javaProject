package com.example.fxjavaProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
public class ReadFxCSV {

    public static ArrayList<Price> createPriceArray(String file) {


    Path pathToFile = Paths.get(file);
    String line = " ";
    ArrayList<Price> priceList = new ArrayList<>();

		try {
        BufferedReader br = new BufferedReader(new FileReader(String.valueOf(pathToFile)));

        while ((line = br.readLine()) != null) {
            String[] attributes = line.split(",");
            Price price = createPrice(attributes);
            priceList.add(price);


        }
    } catch (
    FileNotFoundException e) {
        e.printStackTrace();
    } catch (
    IOException e) {
        e.printStackTrace();
    }
        return priceList;

}
    public static Price createPrice(String[] attributes) {
       int id = Integer.parseInt(attributes[0]);
       String name = attributes[1];
       double bid = Double.parseDouble(attributes[2]);
       double ask= Double.parseDouble(attributes[3]);
       String dateCreated = (attributes[4]);;
       return new Price(id,name,bid,ask,dateCreated);
    }

}

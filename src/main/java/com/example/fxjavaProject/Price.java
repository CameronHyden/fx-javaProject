package com.example.fxjavaProject;

import java.util.Date;

public class Price {

    private int id;
    private String name;
    private double bid;
    private double ask;
    private String dateCreated;



    public Price(int id, String name, double bid, double ask, String dateCreated) {
        this.id = id;
        this.name = name;
        this.bid = bid;
        this.ask = ask;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getAsk() {
        return ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return  id +
                "," + name + '\'' +
                "," + bid +
                "," + ask +
                "," + dateCreated ;
    }

}
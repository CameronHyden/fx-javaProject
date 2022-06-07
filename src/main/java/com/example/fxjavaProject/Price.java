package com.example.fxjavaProject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double bid;
    private double ask;
    private Timestamp dateCreated;

    public Price() { this.dateCreated = new Timestamp(new Date().getTime()); }

    public Price(int id, String name, double bid, double ask) {
        this.id = id;
        this.name = name;
        this.bid = bid;
        this.ask = ask;
        this.dateCreated = new Timestamp(new Date().getTime());
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

    @Override
    public String toString() {
        return  id +
                "," + name + '\'' +
                "," + bid +
                "," + ask +
                "," + dateCreated ;
    }

}
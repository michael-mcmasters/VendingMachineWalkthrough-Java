package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Chips extends Product {

    public Chips(String name, Double price) {
        super(name, price);
    }

    public Chips() {
        this("Doritos", 0.75);
    }

    @Override
    public String message() {
        return "It's literally a bag of air";
    }
}

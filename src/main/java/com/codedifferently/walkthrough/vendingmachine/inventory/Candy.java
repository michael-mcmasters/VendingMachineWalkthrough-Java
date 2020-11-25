package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Candy extends Product {

    public Candy(String name, Double price) {
        super(name, price);
    }

    public Candy() {
        this("Snickers", 0.50);
    }

    @Override
    public String message() {
        return "It's like a man-made vegetable from heaven";
    }
}

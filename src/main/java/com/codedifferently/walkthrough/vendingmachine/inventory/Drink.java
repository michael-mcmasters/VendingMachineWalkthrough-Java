package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Drink extends Product {

    public Drink(String name, Double price) {
        super(name, price);
    }

    public Drink() {
        this("Coke", 1.69);
    }

    @Override
    public String message() {
        return null;
    }
}

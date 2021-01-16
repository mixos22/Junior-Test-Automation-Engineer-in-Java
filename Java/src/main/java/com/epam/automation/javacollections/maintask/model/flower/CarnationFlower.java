package com.epam.automation.javacollections.maintask.model.flower;

public class CarnationFlower extends Flower {

    private final static String name = "Carnation";

    public CarnationFlower(double price, int freshnessClass, int stemLength) {
        super(name, price, freshnessClass, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

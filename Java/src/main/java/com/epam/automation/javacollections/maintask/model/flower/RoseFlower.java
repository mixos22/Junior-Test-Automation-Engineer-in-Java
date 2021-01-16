package com.epam.automation.javacollections.maintask.model.flower;

public class RoseFlower extends Flower {

    private final static String name = "Rose";

    public RoseFlower(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

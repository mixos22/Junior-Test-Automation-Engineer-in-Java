package com.epam.automation.javaCollections.flower;

public class RoseFlower extends Flower {

    private final static String name = "Rose";

    RoseFlower(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

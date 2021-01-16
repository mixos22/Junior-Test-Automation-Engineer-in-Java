package com.epam.automation.javacollections.maintask.model.flower;

public class TulipFlower extends Flower {

    private final static String name = "Tulip";

    public TulipFlower(double price, int levelFresh, int stemLength) {
        super(name, price, levelFresh, stemLength);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

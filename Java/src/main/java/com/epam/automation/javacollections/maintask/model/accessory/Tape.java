package com.epam.automation.javacollections.maintask.model.accessory;

public class Tape extends Accessory {

    private final static String name = "tape";
    private final TapeColorType COLOR_TYPE;

    public Tape(double price, TapeColorType COLOR_TYPE) {
        super(name, price);
        this.COLOR_TYPE = COLOR_TYPE;
    }

    @Override
    public String toString() {
        return super.toString() + "color is: " + COLOR_TYPE + ")";
    }

}

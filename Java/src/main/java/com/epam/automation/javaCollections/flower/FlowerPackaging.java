package com.epam.automation.javaCollections.flower;

public class FlowerPackaging extends Accessory {

    private final static String name = "wrapping paper";
    private final FlowerPackagingType PACKAGING_TYPE;

    FlowerPackaging(double price, FlowerPackagingType PACKAGING_TYPE) {
        super(name, price);
        this.PACKAGING_TYPE = PACKAGING_TYPE;
    }

    @Override
    public String toString() {
        return super.toString() + "packaging material is: " + PACKAGING_TYPE + ")";
    }
}

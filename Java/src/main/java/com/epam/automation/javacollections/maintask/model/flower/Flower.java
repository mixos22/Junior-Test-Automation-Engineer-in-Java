package com.epam.automation.javacollections.maintask.model.flower;

public class Flower {

    private String name;
    private double price;
    private int freshnessClass;
    private int stemLength;

    public Flower() {

    }

    public Flower(String name, double price, int freshnessClass, int stemLength) {
        this.name = name;
        this.price = price;
        this.freshnessClass = freshnessClass;
        this.stemLength = stemLength;
    }

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setFreshnessClass(int freshnessClass) {
        this.freshnessClass = freshnessClass;
    }

    public int getFreshnessClass() {
        return freshnessClass;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getStemLength() {
        return stemLength;
    }

    @Override
    public String toString() {
        return getName() + " (price is " + price + ", freshness class is " +
                freshnessClass + ", stem length is " + stemLength + ")";
    }
}

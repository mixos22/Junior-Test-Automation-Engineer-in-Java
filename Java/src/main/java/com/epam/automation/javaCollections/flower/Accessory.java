package com.epam.automation.javaCollections.flower;

public class Accessory {

    private String name;
    private String type;
    private double price;

    public Accessory(){

    }

    public Accessory(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Accessory(String name, double price){
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getName() + " (price is " + getPrice() + ", ";
    }
}

package com.epam.automation.javacollections.maintask.model.flower;

import com.epam.automation.javacollections.maintask.model.accessory.Accessory;

import java.util.ArrayList;

public class Bouquet {

    private final ArrayList<Flower> flowers = new ArrayList<>();
    private final ArrayList<Accessory> accessories = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public double getPriceWithoutAccessories() {
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    public double getPriceWithAccessories() {
        double price = getPriceWithoutAccessories();
        for (Accessory accessory : accessories) {
            price += accessory.getPrice();
        }
        return price;
    }

    public void sortList() {
        flowers.sort(new ComparatorFlower());
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i).toString());
        }
    }

    public void findFlower(int minSteamLength, int maxSteamLength) {
        boolean flowerFound = false;
        for (Flower flower : flowers) {
            if ((flower.getStemLength() >= minSteamLength) && (flower.getStemLength() <= maxSteamLength)) {
                System.out.println(flower);
                flowerFound = true;
            }
        }
        if (!flowerFound) {
            System.out.println("There is no such flower");
        }
    }

    public void printFlowers() {
        for (Flower flower : flowers) {
            System.out.println(flower.toString());
        }
    }

    public void printAccessories() {
        for (Accessory accessory : accessories) {
            System.out.println(accessory.toString());
        }
    }
}





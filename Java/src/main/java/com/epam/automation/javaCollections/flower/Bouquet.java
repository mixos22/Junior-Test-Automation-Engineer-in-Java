package com.epam.automation.javaCollections.flower;

import java.util.ArrayList;

public class Bouquet {

    private double price;

    public double getPrice() {
        return price;
    }

    private final ArrayList<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
        price += flower.getPrice();
    }

    public void sortList() {
        flowers.sort(new ComparatorFlower());
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println(flowers.get(i).toString());
        }
    }

    public void findFlower(int o1, int o2) {
        boolean flowerFound = false;
        for (int i = 0; i < flowers.size(); i++) {
            if ((flowers.get(i).getStemLength() >= o1) && (flowers.get(i).getStemLength() <= o2)) {
                System.out.println(flowers.get(i).toString());
                flowerFound = true;
            }
        }
        if (!flowerFound) {
            System.out.println("There is no such flower");
        }
    }

    public void printFlowers() {
        for(int i = 0; i < flowers.size(); i++ ){
            System.out.println(flowers.get(i).toString());
        }
    }
}





package com.epam.automation.javacollections.maintask;

import com.epam.automation.javacollections.maintask.model.accessory.*;
import com.epam.automation.javacollections.maintask.model.flower.*;

public class FlowerShop {

    public Bouquet createBouquet() {
        Flower rose = new RoseFlower(10.00, 1, 20);
        Flower tulip = new TulipFlower(6.00, 2, 15);
        Flower carnation = new CarnationFlower(8.00, 3, 20);
        Flower rose2 = new RoseFlower(7.00, 3, 25);
        Flower tulip2 = new TulipFlower(8.00, 1, 15);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(tulip);
        bouquet.addFlower(carnation);
        bouquet.addFlower(rose2);
        bouquet.addFlower(tulip2);
        Accessory flowerPackaging = new FlowerPackaging(1.50, FlowerPackagingType.CELLOPHANE);
        Accessory tape = new Tape(0.50, TapeColorType.WHITE);
        bouquet.addAccessory(flowerPackaging);
        bouquet.addAccessory(tape);
        return bouquet;
    }
}

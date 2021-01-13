package com.epam.automation.javaCollections.consolApplication;

import com.epam.automation.javaCollections.flower.FlowerShop;

import java.util.Scanner;

public class ConsolMenu {
    public void initialization() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1-create the bouquet\n" +
                    "0-exit the application\n" +
                    "Enter number:"
            );
            String result = scanner.next();
            selectScript(result);
        }
    }

    public void selectScript(String result) {
        switch (result) {
            case "0": {
                System.exit(0);
                break;
            }
            case "1": {
                FlowerShop flowerShop = new FlowerShop();
                flowerShop.createBouquetWithAccessories();
                break;
            }
            default: {
                System.out.println("Enter right number");
            }
        }
    }
}


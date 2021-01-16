package com.epam.automation.javacollections.maintask.consoleapplication;

import com.epam.automation.javacollections.maintask.FlowerShop;
import com.epam.automation.javacollections.maintask.model.flower.Bouquet;

import java.util.Scanner;

public class ConsoleMenu {
    public void initialization() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1-create the bouquet\n" +
                            "0-exit the application\n" +
                            "Enter number:"
            );
            String result = scanner.next();
            selectScript(result, scanner);
        }
    }

    public void selectScript(String result, Scanner scanner) {
        switch (result) {
            case "0": {
                System.exit(0);
                break;
            }
            case "1": {
                FlowerShop flowerShop = new FlowerShop();
                Bouquet bouquet = flowerShop.createBouquet();
                System.out.println("The bouquet is created.\nIt consists of:");
                bouquet.printFlowers();
                bouquet.printAccessories();
                System.out.println("Cost of the bouquet including accessories is " + bouquet.getPriceWithAccessories());
                System.out.println("Cost of the bouquet without accessories is " + bouquet.getPriceWithoutAccessories());
                chooseActionOnBouquet(bouquet, scanner);
            }
            default: {
                System.out.println("Enter right number");
            }
        }
    }

    public void chooseActionOnBouquet(Bouquet bouquet, Scanner scanner) {
        while (true) {
            System.out.println(
                    "Please make a choice:\n" +
                            "0-exit the application\n" +
                            "1-sort flowers by freshness class\n" +
                            "2-find a flower in a bouquet that matches a given range of stem lengths"
            );
            String result = scanner.next();
            switch (result) {
                case "0": {
                    System.exit(0);
                }
                case "1": {
                    System.out.println("A list of flowers in the bouquet that are sorted by freshness:");
                    bouquet.sortList();
                    break;
                }
                case "2": {
                    System.out.println("Enter the range from: ");
                    int from = Integer.parseInt(scanner.next());
                    System.out.println("Enter the range to: ");
                    int to = Integer.parseInt(scanner.next());
                    System.out.println("A list that meets the conditions you specified:");
                    bouquet.findFlower(from, to);
                    break;
                }
                default:
                    System.out.println(
                            "Incorrect value\n" +
                                    "Enter right number");
            }
        }
    }
}


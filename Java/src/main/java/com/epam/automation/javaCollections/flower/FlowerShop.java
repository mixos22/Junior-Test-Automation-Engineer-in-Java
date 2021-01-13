package com.epam.automation.javaCollections.flower;

import java.util.Scanner;

public class FlowerShop {

    public void createBouquetWithAccessories() {
        Bouquet bouquet = createBouquet();
        System.out.println("The bouquet is created.\nIt consists of:");
        bouquet.printFlowers();
        Accessory flowerPackaging = new FlowerPackaging(1.50,FlowerPackagingType.CELLOPHANE);
        Accessory tape = new Tape(0.50,TapeColorType.WHITE);
        System.out.println("Added accessory: " + flowerPackaging.toString());
        System.out.println("Added accessory: " + tape.toString());
        consolIO(bouquet,flowerPackaging,tape);
    }

    public static Bouquet createBouquet() {
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

        return bouquet;
    }

    public static void consolIO(Bouquet bouquet, Accessory flowerPackaging, Accessory tape) {
        double totalPrice;
        totalPrice = bouquet.getPrice() + flowerPackaging.getPrice() + tape.getPrice();
        System.out.println("Cost of the bouquet including accessories is " + totalPrice);
        System.out.println("Cost of the bouquet without accessories is " + bouquet.getPrice());
        Scanner scanner = new Scanner(System.in);
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
                        findFlower(scanner, bouquet);
                        break;
                    }
                    default:
                        System.out.println(
                                "Incorrect value\n" +
                                "Enter right number");
                }
            }
        }


    public static void findFlower(Scanner scanner, Bouquet bouquet) {
        System.out.println("Enter the range from: ");
        int from = Integer.parseInt(scanner.next());
        System.out.println("Enter the range to: ");
        int to = Integer.parseInt(scanner.next());
        System.out.println("A list that meets the conditions you specified:");
        bouquet.findFlower(from, to);
    }
}

package com.epam.automation.javaClasses;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Customer[] customers = CustomerUtils.createCustomers();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Please make a choice:\n" +
                            "0-exit\n" +
                            "1-displaying customers in alphabetical order\n" +
                            "2-displaying customers with credit card in the interval\n" +
                            ":"
            );
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    CustomerUtils.sortByName(customers);
                    CustomerUtils.print(customers);
                    break;
                case 2:
                    System.out.println("Enter the range of credit cards");
                    System.out.println("from: ");
                    String from = "";
                    while (from.length() == 0) {
                        from = scanner.nextLine();
                    }
                    System.out.println("to: ");
                    String to = "";
                    while (to.length() == 0) {
                        to = scanner.nextLine();
                    }
                    CustomerUtils.printIfCardInRange(from, to, customers);
                    break;
                default:
                    System.out.println("Wrong menu item selected, please re-enter");
                }
            } catch(InputMismatchException e) {
            System.out.println("Wrong menu item selected, please re-enter");
            scanner.nextLine();
            }
        }
    }
}

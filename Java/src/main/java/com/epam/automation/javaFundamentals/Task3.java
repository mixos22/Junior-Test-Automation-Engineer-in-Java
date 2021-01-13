package com.epam.automation.javaFundamentals;

import java.util.Scanner;

public class Task3 {

    public static void printRandomNumbersToLineAndToColumn() {
        int numberOfElements = readQuantityFromConsole();
        int[] array = createArrayOfRandomNumbers(numberOfElements);
        printArrayWithNewLine(array);
        printArrayWithoutNewLine(array);
    }

    private static int readQuantityFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n" +
                "Put quantity:");
        return scanner.nextInt();
    }

    private static int[] createArrayOfRandomNumbers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void printArrayWithNewLine(int[] array) {
        System.out.println("Elements in column:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void printArrayWithoutNewLine(int[] array) {
        System.out.println("Elements in line:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}

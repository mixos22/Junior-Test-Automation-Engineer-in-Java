package com.epam.automation.javaFundamentals;

public class Task2 {
    public static void printReverseArray(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}

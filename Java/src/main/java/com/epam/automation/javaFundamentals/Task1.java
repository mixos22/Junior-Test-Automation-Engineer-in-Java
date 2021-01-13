package com.epam.automation.javaFundamentals;

import java.util.Scanner;

public class Task1 {
    public static String readNameFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        return scanner.nextLine();
    }

    public static void sayWelcomeToUser() {
        System.out.println("Welcome, " + readNameFromConsole());
    }
}

package com.epam.automation.javafundamentals.maintask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Task5 {

    private static int readNumberOfMonthFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number (from 0 to 12):");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            throw new RuntimeException("Wrong entered number, put number from 1 to 12");
        }
        return month;
    }

    public static void printMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, readNumberOfMonthFromConsole() - 1);
        System.out.println(new SimpleDateFormat("MMMM").format(calendar.getTime()));
    }
}

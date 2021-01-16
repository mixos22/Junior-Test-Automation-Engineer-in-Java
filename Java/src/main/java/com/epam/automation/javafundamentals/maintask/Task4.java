package com.epam.automation.javafundamentals.maintask;

public class Task4 {

    public static void calculateSumAndProductOfIntegersFromCommandLine(String[] args) {
        int sumOfArguments = 0;
        int productOfArguments = 1;
        for (int i = 0; i < args.length; i++) {
            int argument = Integer.parseInt(args[i]);
            sumOfArguments = sumOfArguments + argument;
            productOfArguments = productOfArguments * argument;
        }
        System.out.println("Sum is = " + sumOfArguments);
        System.out.println("Product is = " + productOfArguments);
    }
}



package com.epam.automation.javaCollections.optionalTasks;

import java.util.Scanner;
import java.util.Stack;

public class OptionalTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        if (scanner.hasNextInt()) {
            Stack <Character> stack = new Stack<>();
            char[] chars = scanner.nextLine().toCharArray();
            for (char aChar : chars) {
                stack.push(aChar);
            }
            while (!stack.isEmpty()) {
                {System.out.print(stack.pop());
                }
            }
        }
        else {
            System.out.println("Incorrect value");
        }
        scanner.close();
        }
    }


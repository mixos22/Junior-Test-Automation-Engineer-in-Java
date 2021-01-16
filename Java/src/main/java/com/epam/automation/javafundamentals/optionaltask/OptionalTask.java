package com.epam.automation.javafundamentals.optionaltask;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OptionalTask {

    static String[] strArray;
    static int[] arrayModulo;

    public static void main(String[] args) {
        String lineFromConsole = readLineFromConsole();
        testStringForInputRestrictions(lineFromConsole);
        strArray = lineFromConsole.split(" ");
        arrayModulo = getAbsArrayFromLineFromConsole();
        int lengthOfLongestNumber = countCharactersInLongestNumber();
        int lengthOfShortestNumber = countCharactersInShortestNumber();
        int integersWithLongestLength = countNumbersWithLongestLength(lengthOfLongestNumber);
        int integersWithShortestLength = countNumbersWithShortestLength(lengthOfShortestNumber);
        String longestNumber = findsTheLongestNumberIfItIsOne(lengthOfLongestNumber);
        String shortestNumber = findsTheShortestNumberIfItIsOne(lengthOfShortestNumber);
        if (lengthOfLongestNumber == lengthOfShortestNumber) {
            printsToConsoleInfoAboutLengthIfAllElementsHaveTheSameLength(lengthOfLongestNumber);
        } else {
            printsToConsoleInfoAboutLongestNumber(longestNumber, integersWithLongestLength, lengthOfLongestNumber);
            printsToConsoleInfoAboutShortestNumber(shortestNumber, integersWithShortestLength, lengthOfShortestNumber);
        }
        printsSequenceInAscendingAndDescendingOrderOfTheLengthOfItsNumbers();
        printsNumbersSmallerAndLongerThanAverageLength();
        findsNumberWithMinimumOfDifferentNumbers();
    }

    private static String readLineFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can enter negative integer(ex.-5), positive integer(ex.5) or zero\n" +
                "Please enter only integers separated by a space:");
        return scanner.nextLine();
    }

    static void testStringForInputRestrictions(String lineFromConsole) {

        Pattern pattern = Pattern.compile("[a-zA-Z]+|[\\p{Punct}&&[^-]]");
        Matcher matcher = pattern.matcher(lineFromConsole);
        if (matcher.find()) {
            matcher.reset();
            while (matcher.find()) {
                System.out.println("Wrong argument is: " + matcher.group());
            }
            throw new RuntimeException("\n" +
                    "you entered incorrect data. You can enter 0, positive and negative integers.");
        }
    }

    private static int[] getAbsArrayFromLineFromConsole() {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Math.abs(Integer.parseInt(strArray[i]));
        }
        return intArray;
    }

    private static int[] getIntArrayFromLineFromConsole() {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = (Integer.parseInt(strArray[i]));
        }
        return intArray;
    }

    private static int countCharactersInLongestNumber() {
        int longestNumber = arrayModulo[0];
        for (int element : arrayModulo) {
            if (String.valueOf(element).length() > String.valueOf(longestNumber).length()) {
                longestNumber = element;
            }
        }
        return String.valueOf(longestNumber).length();
    }

    private static int countCharactersInShortestNumber() {
        int shortestNumber = arrayModulo[0];
        for (int element : arrayModulo) {
            if (String.valueOf(element).length() < String.valueOf(shortestNumber).length()) {
                shortestNumber = element;
            }
        }
        return String.valueOf(shortestNumber).length();
    }

    private static String findsTheLongestNumberIfItIsOne(int lengthOfLongestNumber) {
        String longestNumber = strArray[0];
        for (int j = 0; j < arrayModulo.length; j++) {
            if (String.valueOf(arrayModulo[j]).length() == lengthOfLongestNumber) {
                longestNumber = strArray[j];
            }
        }
        return longestNumber;
    }

    private static String findsTheShortestNumberIfItIsOne(int lengthOfShortestNumber) {
        String shortestNumber = strArray[0];
        for (int j = 0; j < arrayModulo.length; j++) {
            if (String.valueOf(arrayModulo[j]).length() == lengthOfShortestNumber) {
                shortestNumber = strArray[j];
            }
        }
        return shortestNumber;
    }

    private static int countNumbersWithLongestLength(int lengthOfLongestNumber) {
        int integersWithLongestLength = 0;
        for (int i : arrayModulo) {
            if (String.valueOf(i).length() == lengthOfLongestNumber) {
                integersWithLongestLength++;
            }
        }
        return integersWithLongestLength;
    }

    private static int countNumbersWithShortestLength(int lengthOfShortestNumber) {
        int integersWithShortestLength = 0;
        for (int i : arrayModulo) {
            if (String.valueOf(i).length() == lengthOfShortestNumber) {
                integersWithShortestLength++;
            }
        }
        return integersWithShortestLength;
    }

    private static void printsToConsoleInfoAboutLongestNumber
            (String longestNumber, int integersWithLongestLength, int lengthOfLongestNumber) {
        if (integersWithLongestLength == 1) {
            System.out.println("There is only one longest number in your sequence.\n" +
                    "Here it is: " + longestNumber + ". \n" +
                    "Its length is " + lengthOfLongestNumber + " figure(s)");
        } else {
            System.out.println("Your sequence has several numbers with the longest length. These are: ");
            for (int i = 0; i < arrayModulo.length; i++) {
                if (String.valueOf(arrayModulo[i]).length() == lengthOfLongestNumber) {
                    System.out.print(strArray[i] + " ");
                }
            }
            System.out.println();
            System.out.println("Their length is " + lengthOfLongestNumber + " figure(s)");
        }
    }

    private static void printsToConsoleInfoAboutShortestNumber
            (String shortestNumber, int integersWithShortestLength, int lengthOfShortestNumber) {
        if (integersWithShortestLength == 1) {
            System.out.println("There is only one shortest number in your sequence. \n" +
                    "Here it is: " + shortestNumber + ". \n" +
                    "Its length is " + lengthOfShortestNumber + " figure(s)");
        } else {
            System.out.println("Your sequence has several numbers with the shortest length." + " These are: ");
            for (int i = 0; i < arrayModulo.length; i++) {
                if (String.valueOf(arrayModulo[i]).length() == lengthOfShortestNumber) {
                    System.out.print(strArray[i] + " ");
                }
            }
            System.out.println();
            System.out.println("Their length is " + lengthOfShortestNumber + " figure(s)");
        }
    }

    private static void printsToConsoleInfoAboutLengthIfAllElementsHaveTheSameLength
            (int lengthOfLongestNumber) {
        System.out.println("All numbers in the sequence have the same length. They are " + Arrays.toString(strArray) +
                ". They all consist of " + lengthOfLongestNumber + " figure(s)");
    }

    private static void printsSequenceInAscendingAndDescendingOrderOfTheLengthOfItsNumbers() {
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }
        List<Integer> numbersList = getSortList(numbers);
        System.out.println("Sort Ascending: ");
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
        System.out.println("\n" +
                "Sort descending: ");
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            System.out.print(numbersList.get(i) + " ");
        }
    }

    private static List<Integer> getSortList(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int num : numbers) {
            numbersList.add(num);
        }
        numbersList.sort(Comparator.comparingInt(Math::abs));
        return numbersList;
    }

    private static void printsNumbersSmallerAndLongerThanAverageLength() {
        int[] numbers = getIntArrayFromLineFromConsole();
        int[] arrayAbsNum = getAbsArrayFromLineFromConsole();
        double[] countCharInNumbers = new double[arrayAbsNum.length];
        for (int i = 0; i < arrayAbsNum.length; i++) {
            countCharInNumbers[i] = Math.ceil(Math.log10(arrayAbsNum[i] + 0.5));
        }
        double sum = 0;
        for (double countCharInNumber : countCharInNumbers) {
            sum += countCharInNumber;
        }
        double average = Math.round((sum / countCharInNumbers.length) * 100.0) / 100.0;
        System.out.println("\n" +
                "Numbers with length less than " + average + " : ");
        for (int i = 0; i < countCharInNumbers.length; i++) {
            if (countCharInNumbers[i] < average) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\n" +
                "Numbers with length more than " + average + " : ");
        for (int i = 0; i < countCharInNumbers.length; i++) {
            if (countCharInNumbers[i] > average) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    private static int[] getCharsOfInteger(int number) {
        int[] elements = new int[(int) Math.ceil(Math.log10(number + 0.5))];
        for (int i = 0; i < elements.length; i++) {
            elements[elements.length - i - 1] = number % 10;
            number /= 10;
        }
        return elements;
    }

    private static void findsNumberWithMinimumOfDifferentNumbers() {
        int[] numbers = getIntArrayFromLineFromConsole();
        int[] arrayAbsNum = getAbsArrayFromLineFromConsole();
        int[] countArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            getCharsOfInteger(arrayAbsNum[i]);
            for (int j = 0; j < arrayAbsNum.length; j++) {
                for (int k = j + 1; k < arrayAbsNum.length; k++) {
                    if (arrayAbsNum[j] == arrayAbsNum[k]) {
                        count++;
                    }
                }
            }
            countArray[i] = count;
        }
        int maxValueOfDifferentDigitsIndex = 0;
        int maxValueOfDifferentDigits = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > maxValueOfDifferentDigits) {
                maxValueOfDifferentDigitsIndex = i;
                maxValueOfDifferentDigits = countArray[i];
            }
        }
        System.out.println("\n" +
                "Number with a minimum of different numbers: " + numbers[maxValueOfDifferentDigitsIndex]);
    }
}
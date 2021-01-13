package com.epam.automation.javaCollections.optionalTasks;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OptionalTask1 {

    private static final String BASE_PATH = "src\\main\\resources\\";
    static Path filePath = Paths.get(BASE_PATH + "input.txt");
    static List<String> monthsOfTheYear = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        readFile();
        writeFile(monthsOfTheYear);
    }

    public static void readFile() {
        try {
            List<String> line = Files.readAllLines(filePath);
            monthsOfTheYear.addAll(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(List<String> monthsOfTheYear) throws IOException {
        Path newFile = Files.createFile(Paths.get(BASE_PATH + "output.txt"));
        List<String> reversedMonthsOfTheYear = new ArrayList<>();
        for (int i = monthsOfTheYear.size() - 1; i >= 0; i--) {
            reversedMonthsOfTheYear.add(monthsOfTheYear.get(i));
        }
        Files.write(newFile, reversedMonthsOfTheYear);
    }
}



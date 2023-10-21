package com.CsvFileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CsvFileReadingScanner {

    static private void reading() throws IOException {

        File file = new File(".//Data//exam.csv");

        Scanner scanner = new Scanner(file);

        scanner.useDelimiter(",");

        while (scanner.hasNext()){

            System.out.println(scanner.next());
        }

        scanner.close();
    }

    public static void main(String[] args) throws IOException {

        reading();
    }
}

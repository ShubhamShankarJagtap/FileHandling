package com.CsvFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvReadingWithSplit  {

    static private void reading() throws IOException{
        String filePath = ".//Data//exam.csv";

        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while ((line=bufferedReader.readLine())!=null){

            String[] data = line.split("," );

            for (String value:data){

                System.out.print(value + "\t");
            }

            System.out.println();
        }

        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        reading();
    }
}

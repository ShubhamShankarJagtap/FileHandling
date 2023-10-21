package com.CsvFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileWriting {

    static private void writingCSV() throws IOException{
        String csvFilePath=".//Data//exam.csv";
        FileWriter fileWriter = new FileWriter(csvFilePath);
        fileWriter.append("ID,Name,Department,Designation,Salary,Age,/n");
        fileWriter.append("20,Shubham,QA,Test Engineering,27,");

        fileWriter.close();

        System.out.println("csv file has been successfully created." + csvFilePath);
    }

    public static void main(String[] args) throws IOException {
        writingCSV();
    }
}

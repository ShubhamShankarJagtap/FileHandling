package com.FileHandling;

import java.io.*;

public class FileHandlingEx {

    String inputFile ;

    String outputFile;

    FileReader fileReader;

    BufferedReader bufferedReader;

    FileWriter fileWriter;

    BufferedWriter bufferedWriter;

    void fileHandling(){

        inputFile =  "F:\\FileHandling\\Shubham.txt";

        outputFile = "F:\\FileHandling\\file.txt";

        try{

            // Reading from input file

           fileReader = new FileReader(inputFile);

           bufferedReader = new BufferedReader(fileReader);

           int lineCount = 0;

           String line;

           while ((line=bufferedReader.readLine())!=null){
               lineCount++;
           }
           bufferedReader.close();

            // Writing the line count to the output file
           fileWriter = new FileWriter(outputFile);

           bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Total number of lines: " + lineCount);

            bufferedWriter.newLine();

            bufferedWriter.close();

            System.out.println("File handling completed. Check '" + outputFile + "' for the result.");

            System.out.println(line);



            System.out.println(lineCount);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

      new FileHandlingEx().fileHandling();

    }
}

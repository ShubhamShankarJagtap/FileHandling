package com.PropertiesHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperty {

    static private void createProperty() throws IOException{

        String filePath = ".//Data//example.properties";
        File file = new File(filePath);

        Properties properties = new Properties();

        properties.setProperty("Name","Shubham");
        properties.setProperty("Designation","QA");
        properties.setProperty("Age","27");
        properties.setProperty("Department","Testing");

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        properties.store(fileOutputStream,"This is sample properties file.");

        System.out.println("Properties file has been created successfully.");

        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {

          createProperty();
    }
}

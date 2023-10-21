package com.PropertiesHandling;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.*;

public class ReadPropertyFile {
    static private void readProperty() throws  IOException {
        String filePath=".//Data//example.properties";
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties.load(fileInputStream);
        Set<Object> keys=properties.keySet();

        HashMap<String,String> propertyHashmap = new HashMap<>();

        for (Object key : keys){

            propertyHashmap.put(key.toString(),properties.getProperty(key.toString()));
        }


       for( Map.Entry <String,String>map : propertyHashmap.entrySet()){

           System.out.println(map.getKey() + " : " + map.getValue());
       }
    }

    public static void main(String[] args)throws IOException {
        readProperty();
    }
}

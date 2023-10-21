package com.TextFiles;

import java.io.File;

public class FolderActions {
    static private void createFolder(String folderPath){

        File folder = new File(folderPath);

        if (!folder.exists()) {

            folder.mkdir();

            System.out.println("Folder created " + folderPath);
        }
    }

    static private boolean checkFolder(String folderPath){

        File folder = new File(folderPath);

         return folder.exists();
    }

   static private void renameFolder(String oldName, String newName){

        File oldFolder = new File(oldName);

        File newFolder = new File(newName);

       if (oldFolder.exists()) {

           oldFolder.renameTo(newFolder);

           System.out.println(" Old folder is renamed to : " + newName );
       }
   }

   static private void deleteFile(String folderpath){

        File folder = new File(folderpath);

       if (folder.exists()) {

           for(File file :folder.listFiles()){

               file.delete();
           }
           folder.delete();
       }
   }
    public static void main(String[] args) {

        String folderPath = "D:\\myFiles";

        createFolder(folderPath);

       boolean folderExists =  checkFolder(folderPath);

        System.out.println(" Is folder exists : " + folderExists);

        String newName = "D:\\myNewFile";

        renameFolder(folderPath,newName);

        deleteFile(newName);
    }
}

package org.design.decorator.filestorage;

public class FileStorageImpl implements  FileStorage {


    @Override
    public void storeFile(String fileName, byte[] data) {

         System.out.println("Storing file: " + fileName);
         // Here you would implement the logic to store the file data
            // For example, writing to a file system or a database

    }

    @Override
    public String retrieveFile(String fileName) {
        System.out.println("Retrieving file: " + fileName);
        return "File content of " + fileName;
    }

    @Override
    public void deleteFile(String fileName) {
        System.out.println("Deleting file: " + fileName);
    }
}

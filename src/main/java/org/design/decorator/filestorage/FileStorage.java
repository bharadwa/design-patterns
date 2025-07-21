package org.design.decorator.filestorage;

public interface FileStorage {

    public void storeFile(String fileName, byte[] data);

    public String retrieveFile(String fileName);

    public void deleteFile(String fileName);

}

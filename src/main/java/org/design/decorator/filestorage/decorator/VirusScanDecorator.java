package org.design.decorator.filestorage.decorator;

import org.design.decorator.filestorage.FileStorage;
import org.design.decorator.filestorage.utils.StorageUtils;

public class VirusScanDecorator extends BaseFileDecorator {


    public VirusScanDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public void storeFile(String fileName, byte[] data) {
        // Perform virus scan on the file data
        System.out.println("Scanning the data before storing " + fileName);
        if (StorageUtils.isVirusFree(fileName)) {
            fileStorage.storeFile(fileName, data);
        } else {
            System.out.println("File " + fileName + " contains a virus and cannot be stored.");
        }
    }

    @Override
    public String retrieveFile(String fileName) {
        return fileStorage.retrieveFile(fileName);
    }

    @Override
    public void deleteFile(String fileName) {
          fileStorage.deleteFile(fileName);
    }
}

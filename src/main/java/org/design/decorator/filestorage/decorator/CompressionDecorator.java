package org.design.decorator.filestorage.decorator;

import org.design.decorator.filestorage.FileStorage;
import org.design.decorator.filestorage.utils.StorageUtils;

public class CompressionDecorator extends BaseFileDecorator{

    public CompressionDecorator(FileStorage fileStorage) {
       super(fileStorage);
    }

    @Override
    public void storeFile(String fileName, byte[] data) {
        // Compress the data before storing
        System.out.println("Compressing data before storing in " + fileName);
        byte[] compressedData = StorageUtils.compressData(data);
        fileStorage.storeFile(fileName, compressedData);
    }

    @Override
    public String retrieveFile(String fileName) {
          return fileStorage.retrieveFile(fileName);
    }

    @Override
    public void deleteFile(String fileName) {
        // Delete the file without any additional operations
        fileStorage.deleteFile(fileName);
    }
}

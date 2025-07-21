package org.design.decorator.filestorage;

import org.design.decorator.filestorage.decorator.CompressionDecorator;
import org.design.decorator.filestorage.decorator.VirusScanDecorator;

import java.nio.charset.Charset;

public class FileStorageClient {

    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorageImpl();
        fileStorage = new CompressionDecorator(fileStorage);
        String data = "This is a test file content.";
        data.getBytes(Charset.forName("UTF-8"));
        fileStorage.storeFile("test.txt",  data.getBytes(Charset.forName("UTF-8")));
        fileStorage =new VirusScanDecorator(fileStorage);
        fileStorage.storeFile("test.txt",  data.getBytes(Charset.forName("UTF-8")));

    }
}

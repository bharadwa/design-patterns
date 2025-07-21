/*
package org.design.structural.decorator;

import java.io.*;

public class DecoratorPatternDemo {


    public static void main(String args[]) throws IOException {

        InputStream inputStream = new FileInputStream("data.txt");
        inputStream = new BufferedInputStream(inputStream);
        // data input stream
        DataInputStream ds=new DataInputStream(inputStream);
        // read data from the file
        ds.readInt();


        // Core component: reads bytes from a file
        InputStream fileStream = new FileInputStream("data.txt");
        // Decorator 1: adds buffering
        InputStream bufferedStream = new BufferedInputStream(fileStream);
        // Decorator 2: adds methods to read primitive data types
        DataInputStream dataStream = new DataInputStream(bufferedStream);
        // Now you can read primitives efficiently
        int value = dataStream.readInt();
        double d = dataStream.readDouble();
        System.out.println("Read int: " + value);
        System.out.println("Read double: " + d);
        dataStream.close();
    }

    }
}
*/

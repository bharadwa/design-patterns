package org.design.creational.Builder;

public class Client {

    public static void main (String []args) {

        Student s=Student.getBuilder().setAddress("test").
        setName("reddies").setId(1).build();

    }
 }

package org.design.creational.factory;

import java.util.Scanner;

public class FactoryClient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String type=input.next();
        Platform platform= PlatformFactory.getPlatform(type);
        platform.getButton().addButton();
        platform.getMenu().createMenuBar();

    }
}

package org.design.creational.factory;

public class IOSMenuBarFactory implements  IMenuBar{
    @Override
    public IMenuBar createMenuBar() {
        System.out.println("create a menu item for IOS");
        return null;
    }
}

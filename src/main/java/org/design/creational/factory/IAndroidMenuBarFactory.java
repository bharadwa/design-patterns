package org.design.creational.factory;

public class IAndroidMenuBarFactory implements  IMenuBar{
    @Override
    public IMenuBar createMenuBar() {
        System.out.println("create a menu item for Android");
        return null;
    }
}

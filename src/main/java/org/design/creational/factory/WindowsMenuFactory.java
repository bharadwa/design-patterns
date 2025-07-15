package org.design.creational.factory;

public class WindowsMenuFactory implements  IMenuBar{
    @Override
    public IMenuBar createMenuBar() {
        System.out.println("WindowsMenuFactory createMenuBar");
        return null;
    }
}

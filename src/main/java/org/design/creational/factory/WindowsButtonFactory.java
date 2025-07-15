package org.design.creational.factory;

public class WindowsButtonFactory implements IButton{
    @Override
    public void addButton() {
        System.out.println("WindowsButtonFactory addButton");
    }
}

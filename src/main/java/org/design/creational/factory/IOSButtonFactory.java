package org.design.creational.factory;

public class IOSButtonFactory implements IButton {
    @Override
    public void addButton() {
            System.out.println("creating a button for IOS");
    }
}

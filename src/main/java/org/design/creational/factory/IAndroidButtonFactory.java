package org.design.creational.factory;

public class IAndroidButtonFactory implements IButton{
    @Override
    public void addButton() {
        System.out.println("creating a button for Android");

    }
}

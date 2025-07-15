package org.design.creational.factory;

public class AndroidPlatForm extends  Platform{


    @Override
    public IButton getButton() {
        return new IAndroidButtonFactory();
    }

    @Override
    public IMenuBar getMenu() {
        return new IAndroidMenuBarFactory();
    }
}

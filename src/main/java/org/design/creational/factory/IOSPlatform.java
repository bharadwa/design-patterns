package org.design.creational.factory;

public class IOSPlatform extends  Platform{

    @Override
    public IButton getButton() {
        return new IOSButtonFactory();
    }

    @Override
    public IMenuBar getMenu() {
        return new IOSMenuBarFactory();
    }
}

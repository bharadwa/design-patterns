package org.design.creational.factory;

public class WindowsPlatform extends Platform {
    @Override
    public IButton getButton() {
        return null;
    }

    @Override
    public IMenuBar getMenu() {
        return null;
    }
}

package org.design.creational;

public class SingletonPattern {

    private static volatile SingletonPattern instance;

    private SingletonPattern () {
        //won't allow object creation from outside
    }

    public static SingletonPattern getInstance() {
        if(instance==null) {
            synchronized (SingletonPattern.class) {
                if(instance==null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }

}

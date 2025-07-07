package org.design.creational;

public class AnotherSingletonPattern {

    private static volatile AnotherSingletonPattern instance;

    private AnotherSingletonPattern() {

    }

    private static final class InnerHolder {
        private static final AnotherSingletonPattern INSTANCE = new AnotherSingletonPattern();
    }

    public static AnotherSingletonPattern getInstance() {
        return InnerHolder.INSTANCE;
    }


}

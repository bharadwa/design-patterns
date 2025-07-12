package org.design.creational.prototyperegistry.student;

public interface IPrototypeRegistry {

    public  void addPrototype(String key, Student prototype);

    public void removePrototype(String key);

    public Student getPrototype(String key);
}

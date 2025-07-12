package org.design.creational.prototyperegistry;

public interface ObjectClonable<T> {

   T clone() throws CloneNotSupportedException;
}

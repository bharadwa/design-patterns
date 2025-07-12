package org.design.creational.prototyperegistry.student;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ProptoTypeRegistryImpl implements  IPrototypeRegistry {


    private static volatile IPrototypeRegistry instance;

    private static ConcurrentMap<String, Student> prototypes = new ConcurrentHashMap<String, Student>();

    private ProptoTypeRegistryImpl() {

    }
    public static IPrototypeRegistry getInstance() {
        if (instance == null) {
            synchronized (ProptoTypeRegistryImpl.class) {
                if (instance == null) {
                    instance = new ProptoTypeRegistryImpl();
                }
            }
        }
        return instance;
    }

    @Override
    public  void addPrototype(String key, Student prototype) {
        prototypes.putIfAbsent(key,prototype);
    }

    @Override
    public void removePrototype(String key) {
        prototypes.remove(key);
    }

    @Override
    public Student getPrototype(String key) {
        return prototypes.get(key).clone();
    }
}

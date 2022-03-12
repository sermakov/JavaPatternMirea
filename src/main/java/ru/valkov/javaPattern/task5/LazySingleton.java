package ru.valkov.javaPattern.task5;

import static java.util.Objects.isNull;

public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (isNull(instance)) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

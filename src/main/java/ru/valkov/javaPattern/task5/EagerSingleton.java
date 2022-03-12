package ru.valkov.javaPattern.task5;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }
}

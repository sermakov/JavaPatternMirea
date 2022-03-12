package ru.valkov.javaPattern.task6.prototype;

public abstract class CloneableHuman {
    protected int age;
    protected String firstName;

    public CloneableHuman(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    abstract CloneableHuman copy();
}

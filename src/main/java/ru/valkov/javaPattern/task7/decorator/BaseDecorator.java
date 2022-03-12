package ru.valkov.javaPattern.task7.decorator;

public abstract class BaseDecorator implements Sender {
    protected Sender sender;

    public BaseDecorator(Sender sender) {
        this.sender = sender;
    }
}

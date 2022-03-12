package ru.valkov.javaPattern.task8.mediator;

public record MessageProducer(Mediator mediator) implements Component {
    @Override
    public void doSomething() {
        System.out.println("Producing message...");
        mediator.notify(this);
    }
}

package ru.valkov.javaPattern.task8.mediator;

public record MessageConsumer(Mediator mediator) implements Component {
    @Override
    public void doSomething() {
        System.out.println("Consuming message...");
        mediator.notify(this);
    }
}

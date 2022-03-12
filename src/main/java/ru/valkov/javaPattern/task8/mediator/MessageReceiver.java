package ru.valkov.javaPattern.task8.mediator;

public record MessageReceiver(Mediator mediator) implements Component {

    @Override
    public void doSomething() {
        System.out.println("Receiving message...");
        mediator.notify(this);
    }
}

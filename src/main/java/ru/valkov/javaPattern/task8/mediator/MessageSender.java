package ru.valkov.javaPattern.task8.mediator;

public record MessageSender(Mediator mediator) implements Component {
    @Override
    public void doSomething() {
        System.out.println("Sending message...");
        mediator.notify(this);
    }
}

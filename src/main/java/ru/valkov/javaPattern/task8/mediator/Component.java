package ru.valkov.javaPattern.task8.mediator;

public sealed interface Component permits MessageConsumer, MessageReceiver, MessageProducer, MessageSender {
    void doSomething();
}

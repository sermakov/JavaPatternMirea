package ru.valkov.javaPattern.task8.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        MediatorImpl mediator = new MediatorImpl();
        Component producer = new MessageProducer(mediator);
        Component sender = new MessageSender(mediator);
        Component receiver = new MessageReceiver(mediator);
        Component consumer = new MessageConsumer(mediator);
        mediator.init(producer, sender, receiver, consumer);

        producer.doSomething();
    }
}

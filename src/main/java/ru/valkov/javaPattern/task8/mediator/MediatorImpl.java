package ru.valkov.javaPattern.task8.mediator;

public class MediatorImpl implements Mediator {
    private Component producer;
    private Component sender;
    private Component receiver;
    private Component consumer;

    public void init(Component producer, Component sender, Component receiver,
                     Component consumer) {
        this.producer = producer;
        this.sender = sender;
        this.receiver = receiver;
        this.consumer = consumer;
    }

    @Override
    public void notify(Component component) {
        switch (component) {
            case MessageProducer p -> sender.doSomething();
            case MessageSender s -> receiver.doSomething();
            case MessageReceiver r -> consumer.doSomething();
            case MessageConsumer c -> System.out.println("End!");
        }
    }
}

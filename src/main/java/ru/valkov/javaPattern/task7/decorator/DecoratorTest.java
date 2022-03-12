package ru.valkov.javaPattern.task7.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Sender sender = new MessageSender();
        // sender = new ErrSender(sender);
        sender = new OutSender(sender);
        sender.send();
    }
}

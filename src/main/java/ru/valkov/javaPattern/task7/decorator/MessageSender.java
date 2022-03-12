package ru.valkov.javaPattern.task7.decorator;

public class MessageSender implements Sender {
    @Override
    public String send() {
        return "hello";
    }
}

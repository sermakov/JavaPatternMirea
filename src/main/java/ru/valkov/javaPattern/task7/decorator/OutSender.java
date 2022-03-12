package ru.valkov.javaPattern.task7.decorator;

public class OutSender extends BaseDecorator {

    public OutSender(Sender sender) {
        super(sender);
    }

    @Override
    public String send() {
        String message = sender.send();
        System.out.println(message);
        return message;
    }
}

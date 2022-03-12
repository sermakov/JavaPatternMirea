package ru.valkov.javaPattern.task7.decorator;

public class ErrSender extends BaseDecorator {
    public ErrSender(Sender sender) {
        super(sender);
    }

    @Override
    public String send() {
        String message = sender.send();
        System.err.println(message);
        return message;
    }
}

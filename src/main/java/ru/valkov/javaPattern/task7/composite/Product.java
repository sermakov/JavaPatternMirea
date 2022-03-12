package ru.valkov.javaPattern.task7.composite;

public record Product(int price) implements Priceable {
    @Override
    public int getPrice() {
        return price;
    }
}

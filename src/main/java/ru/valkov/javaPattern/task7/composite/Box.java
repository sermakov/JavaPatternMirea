package ru.valkov.javaPattern.task7.composite;

import java.util.List;

public record Box(List<Priceable> elements) implements Priceable {

    @Override
    public int getPrice() {
        return elements
                .parallelStream()
                .mapToInt(Priceable::getPrice)
                .reduce(0, Integer::sum);
    }
}

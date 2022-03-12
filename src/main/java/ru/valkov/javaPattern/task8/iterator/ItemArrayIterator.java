package ru.valkov.javaPattern.task8.iterator;

import java.util.Objects;

public class ItemArrayIterator implements ItemIterator {
    private final Item[] items;
    private int currentPosition;

    public ItemArrayIterator(Item... items) {
        Objects.requireNonNull(items);
        this.items = items;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < items.length - 1;
    }

    @Override
    public Item getNext() {
        Item item =  items[currentPosition];
        currentPosition++;
        return item;
    }
}

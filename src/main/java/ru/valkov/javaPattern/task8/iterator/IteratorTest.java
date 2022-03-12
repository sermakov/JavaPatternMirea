package ru.valkov.javaPattern.task8.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ItemArrayIterator iterator = new ItemArrayIterator(
                new Item("1"),
                new Item("2"),
                new Item("3"),
                new Item("3")
        );

        while (iterator.hasNext()) {
            Item next = iterator.getNext();
            System.out.println(next.title());
        }
    }
}

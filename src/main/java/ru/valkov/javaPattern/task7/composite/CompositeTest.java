package ru.valkov.javaPattern.task7.composite;

import java.util.List;

public class CompositeTest {
    public static void main(String[] args) {
        Priceable smallBox = new Box(
                List.of(
                        new Product(10),
                        new Product(15)
                )
        );
        Priceable bigBox = new Box(
                List.of(
                        smallBox,
                        new Product(15),
                        new Product(10)
                )
        );

        System.out.println(bigBox.getPrice());
    }
}

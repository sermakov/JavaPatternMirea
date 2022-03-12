package ru.valkov.javaPattern.task2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreams {
    public static void main(String[] args) {
        List<Human> humans = List.of(
                new Human(100, "Дмитрий", "Вальков",
                        LocalDate.of(3002, 5, 2), 993),
                new Human(
                        18, "Виктор", "Ляшенко",
                        LocalDate.of(2003, 5, 2), 80
                ),
                new Human(
                        28, "Павел", "Соломатин",
                        LocalDate.of(123, 12, 3), 13
                ),
                new Human(
                        28, "Иван", "Иванов",
                        LocalDate.of(11, 11, 11), 11
                )
        );

        List<Human> result;

        result = humans
                .stream()
                .sorted(Comparator.comparingInt(Human::weight).reversed())
                .collect(Collectors.toList());
        System.out.println(result);

        result = humans
                .stream()
                .filter(human -> !"Иванов".equals(human.lastName()))
                .collect(Collectors.toList());
        System.out.println(result);

        result = humans
                .stream()
                .sorted(Comparator.comparingInt(Human::age))
                .collect(Collectors.toList());
        System.out.println(result);

        int multiply = humans
                .stream()
                .mapToInt(Human::age)
                .reduce(1, (a, b) -> a * b);
        System.out.println(multiply);

    }
}

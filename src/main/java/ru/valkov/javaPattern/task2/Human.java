package ru.valkov.javaPattern.task2;

import java.time.LocalDate;

public record Human(int age, String firstName, String
        lastName, LocalDate birthDate, int weight) {
}

package ru.valkov.javaPattern.task12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    // -Dspring-boot.run.arguments= --destination="destination.txt"
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

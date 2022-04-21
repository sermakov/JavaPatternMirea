package ru.valkov.javaPattern.task13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application13 implements CommandLineRunner {
    @Autowired
    private Student student;
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(Application13.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(student.getName());
        System.out.println(student.getLastName());
        System.out.println(student.getGroup());

        Environment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("student.name"));
    }
}

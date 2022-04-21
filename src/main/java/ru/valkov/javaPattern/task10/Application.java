package ru.valkov.javaPattern.task10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        Programmer programmer = applicationContext.getBean("junior", Programmer.class);
        programmer.doCoding();
    }
}

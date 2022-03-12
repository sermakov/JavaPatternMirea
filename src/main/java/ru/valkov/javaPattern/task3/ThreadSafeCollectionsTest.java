package ru.valkov.javaPattern.task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.HashMap;

public class ThreadSafeCollectionsTest {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.valkov.javaPattern.task3");
        HashMap map = context.getBean("map", HashMap.class);
        Thread t1 = new Thread(
                () -> {
                    map.put("a", "b");
                    System.out.println(map.get("a"));
                }
        );
        Thread t2 = new Thread(
                () -> {
                    map.put("c", "d");
                    System.out.println(map.get("c"));
                }
        );
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

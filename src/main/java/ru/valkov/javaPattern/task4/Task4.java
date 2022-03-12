package ru.valkov.javaPattern.task4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Task4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyExecutorService service = new MyExecutorService(3);
        Future<String> submit = service.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "first";
        });
        Future<String> submit1 = service.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "second";
        });
        Future<String> submit2 = service.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "third";
        });

        System.out.println(submit.get());
        System.out.println(submit1.get());
        System.out.println(submit2.get());
    }
}

package ru.valkov.javaPattern.task4;

import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class MyExecutorService {
    private final AtomicInteger freeThread;

    public MyExecutorService(int threadCount) {
        freeThread = new AtomicInteger(threadCount);
    }

    public synchronized <T> Future<T> submit(Supplier<T> task) throws InterruptedException {
        if (freeThread.get() <= 0) {
            throw new RuntimeException("All threads are busy");
        }
        freeThread.decrementAndGet();
        CompletableFuture<T> future = CompletableFuture.supplyAsync(task);
        future.thenRun(() -> {
            freeThread.incrementAndGet();
            System.out.println(Thread.currentThread().getName() + " закончил работу");
        });
        return future;
    }
}

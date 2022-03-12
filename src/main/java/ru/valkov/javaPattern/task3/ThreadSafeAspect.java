package ru.valkov.javaPattern.task3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Aspect
@Component
public class ThreadSafeAspect {
    private Lock lock = new ReentrantLock();

    @Before("execution(* java.util.Map.*(..))")
    public void lock() {
        lock.lock();
        System.out.println("Monitor locked");
    }

    @After("execution(* java.util.Map.*(..))")
    public void unlock() {
        System.out.println("Monitor released");
        lock.unlock();
    }
}

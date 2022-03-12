package ru.valkov.javaPattern.task6.factory;

import org.springframework.util.Assert;

public class TestFactories {
    public static void main(String[] args) {
        CarFactory factory = new LadaFactory();
        Car car = factory.createCar();
        Assert.isInstanceOf(Lada.class, car);

        factory = new MercedesFactory();
        car = factory.createCar();
        Assert.isInstanceOf(Mercedes.class, car);
    }
}

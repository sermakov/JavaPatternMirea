package ru.valkov.javaPattern.task6.factory;

public class MercedesFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}

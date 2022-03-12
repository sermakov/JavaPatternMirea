package ru.valkov.javaPattern.task6.factory;

public class LadaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Lada();
    }
}

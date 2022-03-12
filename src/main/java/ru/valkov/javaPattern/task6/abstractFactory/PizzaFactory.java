package ru.valkov.javaPattern.task6.abstractFactory;

import ru.valkov.javaPattern.task6.abstractFactory.pizzas.Pizza;

public interface PizzaFactory {
    Pizza makeMargherita();
    Pizza makeSalami();
}

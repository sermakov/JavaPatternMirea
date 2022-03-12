package ru.valkov.javaPattern.task6.abstractFactory;

import ru.valkov.javaPattern.task6.abstractFactory.pizzas.MoscowMargheritaPizza;
import ru.valkov.javaPattern.task6.abstractFactory.pizzas.MoscowSalamiPizza;
import ru.valkov.javaPattern.task6.abstractFactory.pizzas.Pizza;

public class MoscowPizzaFactory implements PizzaFactory {
    @Override
    public Pizza makeMargherita() {
        return new MoscowMargheritaPizza();
    }

    @Override
    public Pizza makeSalami() {
        return new MoscowSalamiPizza();
    }
}

package ru.valkov.javaPattern.task6.abstractFactory;

import ru.valkov.javaPattern.task6.abstractFactory.pizzas.NewYorkMargheritaPizza;
import ru.valkov.javaPattern.task6.abstractFactory.pizzas.NewYorkSalamiPizza;
import ru.valkov.javaPattern.task6.abstractFactory.pizzas.Pizza;

public class NewYorkPizzaFactory implements PizzaFactory {
    @Override
    public Pizza makeMargherita() {
        return new NewYorkMargheritaPizza();
    }

    @Override
    public Pizza makeSalami() {
        return new NewYorkSalamiPizza();
    }
}

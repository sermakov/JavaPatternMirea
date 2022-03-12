package ru.valkov.javaPattern.task6.abstractFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.valkov.javaPattern.task6.abstractFactory.pizzas.*;

class PizzaFactoryTest {

    private PizzaFactory factory;

    @Test
    public void itShouldMakeMoscowPizza() {
        factory = new MoscowPizzaFactory();
        Pizza pizza = factory.makeMargherita();
        Assertions.assertInstanceOf(MoscowMargheritaPizza.class, pizza);
        pizza = factory.makeSalami();
        Assertions.assertInstanceOf(MoscowSalamiPizza.class, pizza);
    }

    @Test
    public void itShouldMakeNewYorkPizza() {
        factory = new NewYorkPizzaFactory();
        Pizza pizza = factory.makeMargherita();
        Assertions.assertInstanceOf(NewYorkMargheritaPizza.class, pizza);
        pizza = factory.makeSalami();
        Assertions.assertInstanceOf(NewYorkSalamiPizza.class, pizza);
    }
}
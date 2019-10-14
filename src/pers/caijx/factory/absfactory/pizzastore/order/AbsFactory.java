package pers.caijx.factory.absfactory.pizzastore.order;

import pers.caijx.factory.absfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {

    Pizza createPizza(String orderType);
}

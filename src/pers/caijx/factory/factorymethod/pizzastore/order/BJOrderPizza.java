package pers.caijx.factory.factorymethod.pizzastore.order;

import pers.caijx.factory.factorymethod.pizzastore.order.OrderPizza;
import pers.caijx.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import pers.caijx.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import pers.caijx.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @ClassName BJOrderPizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class BJOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}

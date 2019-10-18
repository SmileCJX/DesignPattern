package pers.caijx.factory.factorymethod.pizzastore.order;

import pers.caijx.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import pers.caijx.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import pers.caijx.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @ClassName LDOrderPizza
 * @Description: 伦敦披萨订购
 * @Author JunXiangCai
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

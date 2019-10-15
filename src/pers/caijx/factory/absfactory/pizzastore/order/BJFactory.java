package pers.caijx.factory.absfactory.pizzastore.order;

import pers.caijx.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import pers.caijx.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @ClassName BJFactory
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if ("pepper".equals(orderType)) {
            pizza = new BJCheesePizza();
        } else if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        }
        return pizza;
    }
}

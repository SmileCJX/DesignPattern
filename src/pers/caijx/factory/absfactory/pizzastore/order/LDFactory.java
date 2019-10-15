package pers.caijx.factory.absfactory.pizzastore.order;

import pers.caijx.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import pers.caijx.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import pers.caijx.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @ClassName LDFactory
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}

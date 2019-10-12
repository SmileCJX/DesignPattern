package pers.caijx.factory.simplefactory.pizzastore.pizza;

import pers.caijx.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @ClassName PepperPizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("胡椒披萨");
        System.out.println(" 给胡椒披萨 准备原材料");
    }
}

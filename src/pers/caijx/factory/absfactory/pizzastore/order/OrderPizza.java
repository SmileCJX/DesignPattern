package pers.caijx.factory.absfactory.pizzastore.order;

import pers.caijx.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class OrderPizza {

    private AbsFactory factory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory factory) {
        Pizza pizza  = null;
        String orderType = ""; // 用户输入
        this.factory = factory;
        do {
            orderType = getType();
            pizza = this.factory.createPizza(orderType); // factory可能是北京的工厂子类，也可能是伦敦的工厂子类
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

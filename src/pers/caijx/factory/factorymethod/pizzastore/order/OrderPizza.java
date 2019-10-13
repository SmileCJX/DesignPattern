package pers.caijx.factory.factorymethod.pizzastore.order;

import pers.caijx.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description: TODO
 * @Author caijx
 * @Date 2019/10/13
 * @Version V1.0
 **/
public abstract class OrderPizza {

    public abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType = null; // 订阅披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 抽象方法，由子类工厂完成
            // 输出pizza的制作过程
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("披萨订购失败");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨类型
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

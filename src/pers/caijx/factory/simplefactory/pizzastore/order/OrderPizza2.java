package pers.caijx.factory.simplefactory.pizzastore.order;

import pers.caijx.factory.simplefactory.pizzastore.pizza.Pizza;
import pers.caijx.factory.simplefactory.pizzastore.pizza.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza2
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/12
 * @Version V1.0
 **/
public class OrderPizza2 {

    private Pizza pizza;

    private String orderType;

    public OrderPizza2() {
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
            // 输出pizza的制作过程
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
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

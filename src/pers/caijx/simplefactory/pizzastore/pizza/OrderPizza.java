package pers.caijx.simplefactory.pizzastore.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
public class OrderPizza {

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName(" 希腊披萨");
            } else if ("cheese".equals(orderType)) {
                pizza = new CheesePizza();
                pizza.setName(" 奶酪披萨");
            } else if ("pepper".equals(orderType)) {
                pizza = new PepperPizza();
                pizza.setName(" 胡椒披萨");
            } else {
                break;
            }
            // 输出披萨的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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

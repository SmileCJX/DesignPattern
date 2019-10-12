package pers.caijx.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName SimpleFactory
 * @Description: TODO
 * @Author caijx
 * @Date 2019/10/12
 * @Version V1.0
 **/
public class SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("cheese".equals(type)){
            pizza = new CheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza();
        }
        return pizza;
    }

    // 简单工厂模式也叫静态工厂模式
    public static Pizza createPizza2(String type) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("cheese".equals(type)){
            pizza = new CheesePizza();
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}

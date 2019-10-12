package pers.caijx.simplefactory.pizzastore.pizza;

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
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(type)){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(type)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}

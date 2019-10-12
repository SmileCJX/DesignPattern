package pers.caijx.simplefactory.pizzastore.pizza;

/**
 * @ClassName PizzaStore
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
// 相当于一个客户端，发出订购
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();

        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println(" 退出程序 ");
    }

}

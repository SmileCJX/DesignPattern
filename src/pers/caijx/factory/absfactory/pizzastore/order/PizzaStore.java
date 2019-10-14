package pers.caijx.factory.absfactory.pizzastore.order;

/**
 * @ClassName PizzaStore
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}

package pers.caijx.simplefactory.pizzastore.pizza;

/**
 * @ClassName CheesePizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料");
    }
}

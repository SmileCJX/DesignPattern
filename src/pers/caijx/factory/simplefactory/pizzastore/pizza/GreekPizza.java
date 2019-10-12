package pers.caijx.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName GreekPizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        setName("希腊披萨");
        System.out.println(" 给制作希腊披萨 准备原材料 ");
    }
}

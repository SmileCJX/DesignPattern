package pers.caijx.factory.absfactory.pizzastore.pizza;

/**
 * @ClassName BJCheesePizza
 * @Description: 北京奶酪披萨
 * @Author JunXiangCai
 * @Date 2019/10/12
 * @Version V1.0
 **/
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪披萨 准备原材料");
    }
}

package pers.caijx.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName LDCheesePizza
 * @Description: 伦敦奶酪披萨
 * @Author JunXiangCai
 * @Date 2019/10/12
 * @Version V1.0
 **/
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 原材料准备中 ");
    }
}

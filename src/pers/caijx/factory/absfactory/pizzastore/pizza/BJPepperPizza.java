package pers.caijx.factory.absfactory.pizzastore.pizza;

/**
 * @ClassName BJPepperPizza
 * @Description: 北京胡椒披萨
 * @Author JunXiangCai
 * @Date 2019/10/12
 * @Version V1.0
 **/
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}

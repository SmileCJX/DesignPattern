package pers.caijx.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName LDPepperPizza
 * @Description: 伦敦胡椒披萨
 * @Author JunXiangCai
 * @Date 2019/10/12
 * @Version V1.0
 **/
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料 ");
    }
}

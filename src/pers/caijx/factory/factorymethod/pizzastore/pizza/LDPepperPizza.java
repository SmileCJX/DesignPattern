package pers.caijx.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName LDPepperPizza
 * @Description: TODO
 * @Author Think
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

package pers.caijx.decorator;

/**
 * @ClassName Decorator
 * @Description: 调味品
 * @Author JunXiangCai
 * @Date 2019/11/11
 * @Version V1.0
 **/
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice() 自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // ojb.getDes() 输出被装饰者的信息
        return super.getDes() + " " + super.getPrice() + " && " + obj.getDes();
    }
}

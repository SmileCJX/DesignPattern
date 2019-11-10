package pers.caijx.decorator;

/**
 * @ClassName Milk
 * @Description: 牛奶调味品
 * @Author JunXiangCai
 * @Date 2019/11/11
 * @Version V1.0
 **/
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0F);
    }
}

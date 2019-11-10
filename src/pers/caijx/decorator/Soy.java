package pers.caijx.decorator;

/**
 * @ClassName Soy
 * @Description: 豆浆调味品
 * @Author JunXiangCai
 * @Date 2019/11/11
 * @Version V1.0
 **/
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆 ");
        setPrice(1.5F);
    }
}

package pers.caijx.decorator;

/**
 * @ClassName Coffee
 * @Description: TODO
 * @Author Think
 * @Date 2019/11/10
 * @Version V1.0
 **/
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}

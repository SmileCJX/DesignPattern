package pers.caijx.decorator;

/**
 * @ClassName Drink
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/10
 * @Version V1.0
 **/
public abstract class Drink {

    private String des; // 描述

    private float price = 0.0F;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     *  计算费用的抽象方法
     *  子类来实现
     * @return
     */
    public abstract float cost();

    @Override
    public String toString() {
        return "Drink{" +
                "des='" + des + '\'' +
                ", price=" + price +
                '}';
    }
}

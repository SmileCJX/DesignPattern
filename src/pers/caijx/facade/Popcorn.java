package pers.caijx.facade;

/**
 * @ClassName Popcorn
 * @Description: 爆米花机
 * @Author JunXiangCai
 * @Date 2019/11/19
 * @Version V1.0
 **/
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn off ");
    }

    public void pop() {
        System.out.println(" popcorn is poping ");
    }
}

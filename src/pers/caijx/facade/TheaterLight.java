package pers.caijx.facade;

/**
 * @ClassName TheaterLight
 * @Description: 灯光
 * @Author JunXiangCai
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright ");
    }
}

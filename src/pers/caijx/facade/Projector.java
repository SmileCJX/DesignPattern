package pers.caijx.facade;

/**
 * @ClassName Projector
 * @Description: 投影仪
 * @Author JunXiangCai
 * @Date 2019/11/19
 * @Version V1.0
 **/
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector off ");
    }

    public void focus() {
        System.out.println(" Projector is projector ");
    }
}

package pers.caijx.facade;

/**
 * @ClassName Stereo
 * @Description: 立体声
 * @Author JunXiangCai
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Stereo off ");
    }

    public void up() {
        System.out.println(" Stereo up ");
    }

    // ..........
}

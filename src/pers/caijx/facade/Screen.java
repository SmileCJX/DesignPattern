package pers.caijx.facade;

/**
 * @ClassName Screen
 * @Description: 屏幕
 * @Author JunXiangCai
 * @Date 2019/11/19
 * @Version V1.0
 **/
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }
}

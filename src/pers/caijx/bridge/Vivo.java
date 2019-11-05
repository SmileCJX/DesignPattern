package pers.caijx.bridge;

/**
 * @ClassName Vivo
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public class Vivo implements Brand{

    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }
}

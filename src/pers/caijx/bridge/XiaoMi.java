package pers.caijx.bridge;

/**
 * @ClassName XiaoMi
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }
}

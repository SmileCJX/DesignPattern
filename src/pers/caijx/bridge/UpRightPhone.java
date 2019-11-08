package pers.caijx.bridge;

/**
 * @ClassName UpRightPhone
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("翻盖式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("翻盖式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("翻盖式手机");
    }
}

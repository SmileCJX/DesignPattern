package pers.caijx.bridge;

/**
 * @ClassName FolderPhone
 * @Description: 折叠式手机类，继承抽象类
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public class FolderPhone extends Phone {

    public FolderPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠式手机");
    }
}

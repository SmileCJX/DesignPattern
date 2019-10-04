package pers.caijx.principle.inversion.improve;

/**
 * @ClassName DependencyPass
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/4
 * @Version V1.0
 **/
public class DependencyPass {

    public static void main(String[] args) {

    }
}

///**
// * 方式1： 通过接口传递实现依赖
// * 开关的接口
// */
//interface IOpenAndClose {
//
//    void open(ITV itv); // 抽象方法，接收接口
//}
//
//interface ITV { // ITV接口
//
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

// 方式2：通过构造方法传递依赖
//interface IOpenAndClose {
//
//    void open();
//}
//
//interface ITV {
//
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose {
//
//    private ITV tv;  // 成员
//
//    public OpenAndClose(ITV tv) {  // 构造器
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}

// 通过setter方法传递
interface IOpenAndClose {

    void open();

    void setTv(ITV tv);
}

interface ITV {

    void play();
}

class OpenAndClose implements IOpenAndClose {

    private ITV tv;

    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}
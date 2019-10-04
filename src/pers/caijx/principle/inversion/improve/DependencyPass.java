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

interface ITV { // ITV接口

    void play();
}

/**
 * 方式1： 通过接口传递实现依赖
 * 开关的接口
 */
interface IOpenAndClose {

    void open(ITV itv); // 抽象方法，接收接口
}

class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV itv) {
        itv.play();
    }
}
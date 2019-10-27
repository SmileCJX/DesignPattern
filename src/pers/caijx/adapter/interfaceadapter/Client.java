package pers.caijx.adapter.interfaceadapter;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args) {
        Absadapter absadapter = new Absadapter() {
            // 只需要去覆盖我们需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absadapter.m1();
    }
}

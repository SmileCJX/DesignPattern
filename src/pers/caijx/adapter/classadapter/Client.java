package pers.caijx.adapter.classadapter;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args) {
        System.out.println(" === 类适配器模式 ===");
        Phone phone = new Phone();
        phone.charging(new Adapter());
    }
}

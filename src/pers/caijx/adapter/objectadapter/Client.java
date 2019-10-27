package pers.caijx.adapter.objectadapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
        List list = new ArrayList<>();
    }
}

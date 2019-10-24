package pers.caijx.adapter.classadapter;

/**
 * @ClassName VoltageAdapter
 * @Description: 适配器
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        // 获取到220V电压
        int src = output220V();
        // 转成5V
        int dst = src / 44;
        System.out.println("电压 = " + dst + "伏");
        return dst;
    }
}

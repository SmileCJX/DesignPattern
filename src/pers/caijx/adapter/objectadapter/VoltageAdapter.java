package pers.caijx.adapter.objectadapter;

/**
 * @ClassName VoltageAdapter
 * @Description: 适配器
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class VoltageAdapter implements IVoltage5V {

    /**
     * 关联关系-聚合
     */
    private Voltage220V voltage220V;

    /**
     * 通过构造器，传入一个Voltage220V实例
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            // 获取到220V电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配···");
            // 转成5V
            dst = src / 44;
            System.out.println("适配完成，电压 = " + dst + "伏");
        }
        return dst;
    }
}

package pers.caijx.adapter.objectadapter;

/**
 * @ClassName Voltage220V
 * @Description: 被适配的类
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class Voltage220V {

    /**
     * 输出220V的电压
     * @return 电压伏数
     */
    public int output220V() {
        int src = 220;
        System.out.println("电压 = " + src + "伏");
        return src;
    }
}

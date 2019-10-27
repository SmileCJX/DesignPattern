package pers.caijx.adapter.objectadapter;

/**
 * @ClassName Phone
 * @Description: 手机
 * @Author JunXiangCai
 * @Date 2019/10/24
 * @Version V1.0
 **/
public class Phone {

    /**
     * 给手机充电
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (5 == iVoltage5V.output5V()) {
            System.out.println("电压为5V，可以充电···");
        } else if (5 < iVoltage5V.output5V()){
            System.out.println("电压大于5V，不可以充电···");
        }
    }
}

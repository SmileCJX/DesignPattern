package pers.caijx.jdk;

import java.util.Calendar;

/**
 * @ClassName Factory
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/13
 * @Version V1.0
 **/
public class Factory {

    public static void main(String[] args) {
        // getInstance 是 Calendar的静态方法
        Calendar cal = Calendar.getInstance();
        // 注意月份下标要从0开始，所以取月份 + 1
        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + (cal.get(Calendar.MONTH ) + 1));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));
    }
}

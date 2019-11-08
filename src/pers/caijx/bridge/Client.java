package pers.caijx.bridge;

/**
 * @ClassName Client
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args) {
        // 获取折叠式手机（样式 + 品牌）
        Phone phone = new FolderPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("==========================");

        Phone phone1 = new UpRightPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}

package pers.caijx.flyweight;

/**
 * @ClassName ConcreteWebSite
 * @Description: TODO
 * @Author 具体的网站
 * @Date 2019/11/28
 * @Version V1.0
 **/
public class ConcreteWebSite extends WebSite {

    private String type = ""; // 网站发布的形式（类型）

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为：" + type);
    }
}

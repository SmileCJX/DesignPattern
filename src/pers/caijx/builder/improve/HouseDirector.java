package pers.caijx.builder.improve;

import java.net.URLEncoder;

/**
 * @ClassName HouseDirector
 * @Description: 指挥者，这里指定制作流程，返回房子
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // 通过构造器传入 houseBuilder

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 通过set方法 传入houseBuilder，如果想要修改，通过此方法
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}

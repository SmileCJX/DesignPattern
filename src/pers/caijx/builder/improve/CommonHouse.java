package pers.caijx.builder.improve;

/**
 * @ClassName CommonHouse
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打5米地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙10cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋顶 ");
    }
}

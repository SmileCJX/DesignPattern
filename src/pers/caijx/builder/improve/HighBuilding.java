package pers.caijx.builder.improve;

/**
 * @ClassName HighBuilding
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println(" 高楼的打地基100米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高楼的砌墙20cm ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼的透明屋顶 ");
    }
}

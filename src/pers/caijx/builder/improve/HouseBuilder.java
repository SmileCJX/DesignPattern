package pers.caijx.builder.improve;

/**
 * @ClassName HouseBuilder
 * @Description: 抽象的建造者
 * @Author JunXiangCai
 * @Date 2019/10/19
 * @Version V1.0
 **/
public abstract class HouseBuilder {

    protected House house = new House();

    // 将建造的流程写好，抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    // 建造房子,将产品（房子）返回
    public House buildHouse() {
        return house;
    }
}

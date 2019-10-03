package pers.caijx.pinciple.singleresponsibility;

/**
 * @ClassName SingleResponsibility3
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/3
 * @Version V1.0
 **/
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vechicle vechicle = new Vechicle();
        vechicle.run("汽车");
        vechicle.runAir("轮船");
        vechicle.runWater("飞机");
    }
}

// 方式3的分析
// 1.这种修改方法没有对原来的类做大的修改，只是增加方法
// 2.这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
class Vechicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 公路运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 天空飞行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "水面行...");
    }
}

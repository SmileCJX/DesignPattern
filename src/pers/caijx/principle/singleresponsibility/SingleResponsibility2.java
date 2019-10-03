package pers.caijx.principle.singleresponsibility;

/**
 * @ClassName SingleResponsibility2
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/3
 * @Version V1.0
 **/
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVechicle airVechicle = new AirVechicle();
        airVechicle.run("飞机");
    }
}

// 方案2的分析
// 1.遵守了单一职责原则
// 2.但是这样的改动很大，即要将这个类分解，同时修改客户端
// 3.改进：直接修改Vechicle类，改动的代码会比较少=》方案3
class RoadVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 公路运行");
    }
}

class AirVechicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 天空运行");
    }
}

class WaterVechicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 水上运行");
    }
}

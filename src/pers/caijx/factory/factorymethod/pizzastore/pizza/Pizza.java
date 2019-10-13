package pers.caijx.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName Pizza
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
// 将披萨做成抽象类
public abstract class Pizza {

    protected String name; // 名字

    // 准备原材料，不同的披萨不一样，所以做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking...");
    }

    public void cut() {
        System.out.println(name + " cutting...");
    }

    // 打包
    public void box() {
        System.out.println(name + " boxing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package pers.caijx.singleton.type1;

/**
 * @ClassName SingletonTest01
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
    }
}

// 饿汉式（静态变量）
class Singleton {

    // 1.构造器私有化，外部不能new
    private Singleton() {

    }

    // 2.本类内部创建对象实例
    private static final Singleton instance = new Singleton();

    // 3.提供一个共有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}

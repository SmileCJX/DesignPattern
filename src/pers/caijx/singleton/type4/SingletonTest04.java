package pers.caijx.singleton.type4;

/**
 * @ClassName SingletonTest04
 * @Description: 单例（线程安全懒汉式）
 * @Author Think
 * @Date 2019/10/8
 * @Version V1.0
 **/
public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode = " + singleton2.hashCode());
    }
}

// 懒汉式（线程安全，同步方法）
class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    // 提供一个静态的共有方法，加入同步处理的代码，解决线程安全问题
    // 即懒汉式
    public static synchronized Singleton getInstance() {
        if (null == singleton) {
           singleton = new Singleton();
        }
        return singleton;
    }
}

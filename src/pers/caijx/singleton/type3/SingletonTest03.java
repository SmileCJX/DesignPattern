package pers.caijx.singleton.type3;

/**
 * @ClassName SingletonTest03
 * @Description: 懒汉式1，线程不安全
 * @Author Think
 * @Date 2019/10/8
 * @Version V1.0
 **/
public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode = " + singleton2.hashCode());
    }
}

class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance
    // 即懒汉式
    public static Singleton getInstance() {
        if (null == singleton) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

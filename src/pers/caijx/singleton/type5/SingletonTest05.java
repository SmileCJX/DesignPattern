package pers.caijx.singleton.type5;

/**
 * @ClassName SingletonTest05
 * @Description: 单例（同步代码块懒汉式），不能用，存在安全问题
 * @Author Think
 * @Date 2019/10/8
 * @Version V1.0
 **/
public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("线程安全，同步代码块");
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

    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}

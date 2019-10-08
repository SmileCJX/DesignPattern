package pers.caijx.singleton.type6;

/**
 * @ClassName SingletonTest06
 * @Description: 单例（双重检查）
 * @Author Think
 * @Date 2019/10/8
 * @Version V1.0
 **/
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode = " + singleton2.hashCode());
    }
}

// 懒汉式（线程安全，同步方法）
class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    // 提供一个静态的共有方法，加入双重检查方法，解决线程安全问题，同时解决懒加载问题
    // 同时保证了效率，推荐使用
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

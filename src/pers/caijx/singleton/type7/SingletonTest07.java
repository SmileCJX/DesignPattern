package pers.caijx.singleton.type7;

/**
 * @ClassName SingletonTest07
 * @Description: 单例（静态内部类）
 * @Author Think
 * @Date 2019/10/8
 * @Version V1.0
 **/
public class SingletonTest07 {

    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode = " + singleton1.hashCode());
        System.out.println("singleton2.hashCode = " + singleton2.hashCode());
    }
}

// 静态内部类完成，推荐使用
class Singleton {

    // 构造器私有化
    private Singleton() {

    }

    // 写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供一个静态的共有方法，直接返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}



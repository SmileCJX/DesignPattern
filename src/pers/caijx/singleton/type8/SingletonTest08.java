package pers.caijx.singleton.type8;

/**
 * @ClassName SingletonTest08
 * @Description: 单例（枚举方式）
 * @Author Think
 * @Date 2019/10/9
 * @Version V1.0
 **/
public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

// 使用枚举，可以实现单例，推荐
enum Singleton {

    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}

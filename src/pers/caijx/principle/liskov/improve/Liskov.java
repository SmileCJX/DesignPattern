package pers.caijx.principle.liskov.improve;

/**
 * @ClassName liskov
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/4
 * @Version V1.0
 **/
public class Liskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = " + a.fun1(11,3));
        System.out.println("1 - 8 = " + a.fun1(1,8));
        System.out.println("---------------------------");
        B b = new B();
        // 因为B类不再继承A类，因此调用者，不会再认为fun1是减法
        // 调用完成的功能就会很明确
        System.out.println("11 + 3 = " + b.fun1(11,3)); // 求出11 = 3
        System.out.println("1 + 8 = " + b.fun1(1,8)); // 求出 1 + 8
        System.out.println("11 + 3 + 9 = " + b.fun2(11,3));

        // 使用组合仍然可以使用到A的相关方法
        System.out.println("11 - 3 = " + b.fun3(11,3)); // 求出11 - 3
    }
}

class Base {

}

class A extends Base{

    /**
     *
     * @param num1
     * @param num2
     * @return 返回两个数的差
     */
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}
// 增加了一个新的功能：完成两个数相加，然后和9求和
class B extends Base {

    // 如果B需要使用A类的方法，使用组合关系
    private A a = new A();
    /**
     * 这里重写了A类的方法，可能是无意识
     * @param a
     * @param b
     * @return
     */
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return  fun1(a,b) + 9;
    }

    /**
     * 仍然想用A的方法
     * @param a
     * @param b
     * @return
     */
    public int fun3(int a, int b) {
        return this.a.fun1(a,b);
    }
}

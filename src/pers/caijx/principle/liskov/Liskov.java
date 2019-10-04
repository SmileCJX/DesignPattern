package pers.caijx.principle.liskov;

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
        System.out.println("11 - 3 = " + b.fun1(11,3)); // 这里本意是 求出11 - 3
        System.out.println("1 - 8 = " + b.fun1(1,8)); // 这里本意是 求出 1 - 3
        System.out.println("11 + 3 + 9 = " + b.fun2(11,3));
    }
}

class A {

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

// B 继承了 A
// 增加了一个新的功能：完成两个数相加，然后和9求和
class B extends A{

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
}

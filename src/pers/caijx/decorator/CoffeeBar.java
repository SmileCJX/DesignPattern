package pers.caijx.decorator;

/**
 * @ClassName CoffeeBar
 * @Description: TODO
 * @Author JunXiangCai
 * @Date 2019/11/11
 * @Version V1.0
 **/
public class CoffeeBar {

    public static void main(String[] args) {
        // 装饰者模式下的订单：2份巧克力 + 一份牛奶的LongBlack

        // 1.点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("费用：" + order.cost());
        System.out.println("订单描述信息：" + order.getDes() );
        // 2. order加入一份牛奶
        order = new Milk(order);
        System.out.println("order加入一份牛奶费用：" + order.cost());
        System.out.println("order加入一份牛奶订单描述信息：" + order.getDes() );
        // 3.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶费用，加入一份巧克力费用：" + order.cost());
        System.out.println("order加入一份牛奶，加入一份巧克力订单描述信息：" + order.getDes() ); // 3.order加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order加入一份牛奶费用，加入一份巧克力，加入一份巧克力费用：" + order.cost());
        System.out.println("order加入一份牛奶，加入一份巧克力，加入一份巧克力订单描述信息：" + order.getDes() );

        Drink order2 = new Decaf();
        System.out.println("无因咖啡费用：" + order2.cost());
        System.out.println("无因咖啡订单描述信息：" + order2.getDes());
        order2 = new Milk(order2);
        System.out.println("无因咖啡，加入一份牛奶费用：" + order2.cost());
        System.out.println("无因咖啡，加入一份牛奶订单描述信息：" + order2.getDes());

    }
}

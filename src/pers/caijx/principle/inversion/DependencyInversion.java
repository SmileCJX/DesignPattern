package pers.caijx.principle.inversion;

/**
 * @ClassName DependencyInversion
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/4
 * @Version V1.0
 **/
public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {

    public String getInfo() {
        return "邮件内容： Hello world";
    }
}

// 完成Person接收消息的功能
// 方式1分析
// 1.简单，比较容易想到
// 2.如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接口方法
// 3.解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
//   因为Email，weixin等等都属于接收的范畴，他们各自实现IReceiver接口就OK，这样我们就符合依赖倒转原则
class Person {

    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

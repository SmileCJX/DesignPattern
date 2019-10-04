package pers.caijx.principle.inversion.improve;

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

        person.receive(new WeChat());
    }
}

interface IReceiver {

    String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "邮件内容： Hello world";
    }
}

class WeChat implements IReceiver {

    @Override
    public String getInfo() {
        return "微信内容：Hello ok";
    }
}

class Person {

    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}

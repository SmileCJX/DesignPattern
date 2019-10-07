package pers.caijx.uml.composition;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class Person {

    private IDCard idCard; // 聚合关系

    private Head head = new Head(); // 组合关系
}

package pers.caijx.uml.composition;

/**
 * @ClassName Computer
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class Computer {

    private Monitor monitor = new Monitor(); // 显示器不可以和computer分离

    private Mouse mouse = new Mouse(); // 鼠标可以和computer分离

}

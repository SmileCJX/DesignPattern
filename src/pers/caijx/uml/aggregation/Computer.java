package pers.caijx.uml.aggregation;

/**
 * @ClassName Computer
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class Computer {

    private Monitor monitor; // 显示器可以和computer分离

    private Mouse mouse; // 鼠标可以和computer分离

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}

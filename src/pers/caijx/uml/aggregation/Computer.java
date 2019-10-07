package pers.caijx.uml.aggregation;

/**
 * @ClassName Computer
 * @Description: TODO
 * @Author Think
 * @Date 2019/10/7
 * @Version V1.0
 **/
public class Computer {

    private Computer computer;

    private Mouse mouse;

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}

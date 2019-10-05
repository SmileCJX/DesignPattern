package pers.caijx.principle.Ocp.improve;

/**
 * @ClassName Ocp
 * @Description: 开闭原则改进
 * @Author Think
 * @Date 2019/10/4
 * @Version V1.0
 **/
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

/**
 * 这是一个用于绘图的类【使用类】
 */
class GraphicEditor {

    /**
     * 接收shape对象，然后根据type，来绘制不同的对象
     * @param shape
     */
    public void drawShape(Shape shape) {
        shape.draw();
    }

    /**
     * 绘制矩形
     * @param r
     */
    private void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    /**
     * 绘制圆形
     * @param r
     */
    private void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }

    private void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }

}

abstract class Shape {

    private int m_type;

    public int getM_type() {
        return m_type;
    }

    public void setM_type(int m_type) {
        this.m_type = m_type;
    }

    public abstract void draw(); // 抽象方法
}

class Rectangle extends Shape {

    public Rectangle() {
        super.setM_type(1);
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    public Circle() {
        super.setM_type(2);
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增画三角形
class Triangle extends Shape {

    public Triangle() {
        super.setM_type(3);
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

// 新增一个图形
class OtherGraphic extends Shape {

    public OtherGraphic() {
        super.setM_type(4);
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}



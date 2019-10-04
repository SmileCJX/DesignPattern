package pers.caijx.principle.Ocp;

import java.sql.SQLOutput;

/**
 * @ClassName Ocp
 * @Description: TODO
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
        if (1 == shape.getM_type()) {
            drawRectangle(shape);
        } else if (2 == shape.getM_type()) {
            drawCircle(shape);
        } else if (3 == shape.getM_type()) {
            drawTriangle(shape);
        }
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

class Shape {

    private int m_type;

    public int getM_type() {
        return m_type;
    }

    public void setM_type(int m_type) {
        this.m_type = m_type;
    }
}

class Rectangle extends Shape {

    public Rectangle() {
        super.setM_type(1);
    }
}

class Circle extends Shape {

    public Circle() {
        super.setM_type(2);
    }
}

// 新增画三角形
class Triangle extends Shape {

    public Triangle() {
        super.setM_type(3);
    }
}



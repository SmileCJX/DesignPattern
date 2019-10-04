package pers.caijx.principle.Ocp;

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
    }
}

class GraphicEditor {

    public void drawShape(Shape shape) {
        if (1 == shape.getM_type()) {
            drawRectangle(shape);
        } else if (2 == shape.getM_type()) {
            drawCircle(shape);
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



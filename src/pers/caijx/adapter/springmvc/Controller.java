package pers.caijx.adapter.springmvc;

/**
 * @ClassName Controller
 * @Description: 多种controller实现
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public interface Controller {
}

class HttpController implements Controller {

    public void doHttpHandler() {
        System.out.println("http...");
    }
}

class SimpleController implements Controller {

    public void doSimpleHandler() {
        System.out.println("Simple...");
    }
}

class AnnotationController implements Controller {

    public void doAnnotationHandler() {
        System.out.println("Annotation...");
    }
}
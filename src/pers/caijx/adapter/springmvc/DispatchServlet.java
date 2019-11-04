package pers.caijx.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DispatchServlet
 * @Description: TODO
 * @Author Think
 * @Date 2019/11/4
 * @Version V1.0
 **/
public class DispatchServlet {

    private static List<HandlerApapter> handlerApapters = new ArrayList<>();

    public DispatchServlet() {
        handlerApapters.add(new HttpHandlerAdapter());
        handlerApapters.add(new SimpleHandlerAdapter());
        handlerApapters.add(new AnnotationHandlerAdapter());
    }

    public void dispatch() {
        // 此处可以模拟SpringMVC从request取handler对象
        // 适配器可以获取到希望的Controller
//        HttpController controller = new HttpController();
        SimpleController controller = new SimpleController();
//        AnnotationController controller = new AnnotationController();
        // 得到对应的适配器
        HandlerApapter handlerApapter = getHandler(controller);
        // 通过适配器执行对应的方法
        handlerApapter.handler(controller);
    }

    private HandlerApapter getHandler(Controller controller) {
        // 遍历，根据得到的controller(handler)，返回对应适配器
        for (HandlerApapter handlerApapter : this.handlerApapters) {
            if (handlerApapter.supports(controller)) {
                return handlerApapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().dispatch();
    }

}

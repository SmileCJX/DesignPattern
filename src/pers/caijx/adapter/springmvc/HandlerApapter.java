package pers.caijx.adapter.springmvc;

/**
 * @ClassName HandlerApapter
 * @Description: 定义一个Adapter接口
 * @Author JunXiangCai
 * @Date 2019/11/4
 * @Version V1.0
 **/
public interface HandlerApapter {

    boolean supports(Object handler);

    void handler(Object handler);
}

class HttpHandlerAdapter implements HandlerApapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handler(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}

/**
 * 多种适配器类
 */
class SimpleHandlerAdapter implements HandlerApapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerApapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}

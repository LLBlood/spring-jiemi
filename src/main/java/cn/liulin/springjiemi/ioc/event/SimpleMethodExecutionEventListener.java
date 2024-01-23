package cn.liulin.springjiemi.ioc.event;

/**
 * cn.liulin.springjiemi.ioc.event$
 *
 * @author ll
 * @date 2024-01-04 16:41:14
 **/
public class SimpleMethodExecutionEventListener implements MethodExecutionEventListener {
    @Override
    public void onMethodBegin(MethodExecutionEvent evt) {
        String methodName = evt.getMethodName();
        System.out.println("start to execute the method["+methodName+"].");
    }

    @Override
    public void onMethodEnd(MethodExecutionEvent evt) {
        String methodName = evt.getMethodName();
        System.out.println("finished to execute the method["+methodName+"].");
    }
}

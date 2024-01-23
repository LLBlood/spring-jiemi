package cn.liulin.springjiemi.ioc.event.applica;

import cn.liulin.springjiemi.ioc.event.MethodExecutionStatus;
import org.springframework.context.ApplicationListener;

/**
 * cn.liulin.springjiemi.ioc.event.applica$
 *
 * @author ll
 * @date 2024-01-05 10:19:27
 **/
public class MethodExecutionEventListener implements ApplicationListener<MethodExecutionEvent> {
    @Override
    public void onApplicationEvent(MethodExecutionEvent methodExecutionEvent) {
        MethodExecutionStatus methodExecutionStatus = methodExecutionEvent.getMethodExecutionStatus();
        String methodName = methodExecutionEvent.getMethodName();
        if (methodExecutionStatus == MethodExecutionStatus.BEGIN) {
            System.out.println("start to execute the method["+methodName+"].");
        } else {
            System.out.println("finished to execute the method["+methodName+"].");
        }
    }
}

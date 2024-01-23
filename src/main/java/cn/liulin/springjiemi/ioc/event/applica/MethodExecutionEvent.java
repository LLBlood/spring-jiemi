package cn.liulin.springjiemi.ioc.event.applica;

import cn.liulin.springjiemi.ioc.event.MethodExecutionStatus;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * cn.liulin.springjiemi.ioc.event.applica$
 *
 * @author ll
 * @date 2024-01-05 10:15:03
 **/
public class MethodExecutionEvent extends ApplicationEvent {

    private String methodName;

    private MethodExecutionStatus methodExecutionStatus;


    public MethodExecutionEvent(Object source) {
        super(source);
    }

    public MethodExecutionEvent(Object source, Clock clock) {
        super(source, clock);
    }

    public MethodExecutionEvent(Object source, String methodName,
                                MethodExecutionStatus methodExecutionStatus) {
        super(source);
        this.methodName = methodName;
        this.methodExecutionStatus = methodExecutionStatus;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public MethodExecutionStatus getMethodExecutionStatus() {
        return methodExecutionStatus;
    }

    public void setMethodExecutionStatus(MethodExecutionStatus methodExecutionStatus) {
        this.methodExecutionStatus = methodExecutionStatus;
    }
}

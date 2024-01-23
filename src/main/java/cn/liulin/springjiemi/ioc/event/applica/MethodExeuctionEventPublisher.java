package cn.liulin.springjiemi.ioc.event.applica;

import cn.liulin.springjiemi.ioc.event.MethodExecutionStatus;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * cn.liulin.springjiemi.ioc.event.applica$
 *
 * @author ll
 * @date 2024-01-05 10:23:07
 **/
public class MethodExeuctionEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    public void methodToMonitor()
    {
        MethodExecutionEvent beginEvt = new MethodExecutionEvent(this,"methodToMonitor", MethodExecutionStatus.BEGIN);
        this.eventPublisher.publishEvent(beginEvt);
        // 执行实际方法逻辑
        // ..
        MethodExecutionEvent endEvt = new MethodExecutionEvent(this,"methodToMonitor",MethodExecutionStatus.END);
        this.eventPublisher.publishEvent(endEvt);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }
}

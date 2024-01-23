package cn.liulin.springjiemi.ioc.event.applica;

import cn.liulin.springjiemi.ioc.event.MethodExecutionStatus;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cn.liulin.springjiemi.ioc.event.applica$
 *
 * @author ll
 * @date 2024-01-05 10:23:07
 **/
public class MethodExeuctionEventTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("execut-config.xml");
        MethodExeuctionEventPublisher methodExeuctionEventPublisher = (MethodExeuctionEventPublisher) applicationContext.getBean("evtPublisher");
        methodExeuctionEventPublisher.methodToMonitor();
    }
}

package cn.liulin.springjiemi.aop.advisor.jdkproxy;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * cn.liulin.springjiemi.aop.advisor$
 *
 * @author ll
 * @date 2024-01-12 16:31:57
 **/
public class TaskTest {

    @Test
    public void test() {
        MockTask mockTask = new MockTask();
        ProxyFactory proxyFactory = new ProxyFactory(mockTask);
//        proxyFactory.setInterfaces(new Class[] {ITask.class});
        NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
        nameMatchMethodPointcutAdvisor.setMappedName("execute");
        nameMatchMethodPointcutAdvisor.setAdvice(new PerformanceMethodInterceptor());
        proxyFactory.addAdvisor(nameMatchMethodPointcutAdvisor);
        ITask iTask = (ITask) proxyFactory.getProxy();
        iTask.execute(null);
        System.out.println(iTask.getClass());
    }

    @Test
    public void test2() {
        MockTask mockTask = new MockTask();
        ProxyFactory proxyFactory = new ProxyFactory(mockTask);
        // 强制使用类代理
        proxyFactory.setProxyTargetClass(true);
        NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
        nameMatchMethodPointcutAdvisor.setMappedName("execute");
        nameMatchMethodPointcutAdvisor.setAdvice(new PerformanceMethodInterceptor());
        proxyFactory.addAdvisor(nameMatchMethodPointcutAdvisor);
        ITask iTask = (ITask) proxyFactory.getProxy();
        iTask.execute(null);
        System.out.println(iTask.getClass());
    }
}

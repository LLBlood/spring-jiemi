package cn.liulin.springjiemi.aop.advisor.cglib;

import cn.liulin.springjiemi.aop.advisor.jdkproxy.PerformanceMethodInterceptor;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

/**
 * cn.liulin.springjiemi.aop.advisor.cglib$
 *
 * @author ll
 * @date 2024-01-12 16:36:52
 **/
public class ExecuteTest {
    @Test
    public void test() {
        ProxyFactory proxyFactory = new ProxyFactory(new Executable());
        NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
        nameMatchMethodPointcutAdvisor.setMappedName("execute");
        nameMatchMethodPointcutAdvisor.setAdvice(new PerformanceMethodInterceptor());
        proxyFactory.addAdvisor(nameMatchMethodPointcutAdvisor);
        Executable executable = (Executable) proxyFactory.getProxy();
        System.out.println(executable.getClass());
        executable.execute();
    }
}

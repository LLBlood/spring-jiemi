package cn.liulin.springjiemi.aop.advisor.jdkproxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

/**
 * cn.liulin.springjiemi.aop.advisor$
 *
 * @author ll
 * @date 2024-01-12 16:29:14
 **/
public class PerformanceMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        try {
            stopWatch.start();
            return invocation.proceed();
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.toString());
        }
    }
}

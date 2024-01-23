package cn.liulin.springjiemi.ioc.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.ResourceLoader;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-03 10:44:20
 **/
public class FooBar3 implements ApplicationContextAware {
    private ResourceLoader resourceLoader;

    public void foo(String location) {
        System.out.println(getResourceLoader().getResource(location).getClass());
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        this.resourceLoader = ctx;
    }
}

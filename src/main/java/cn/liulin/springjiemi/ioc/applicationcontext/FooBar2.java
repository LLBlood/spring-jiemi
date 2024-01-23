package cn.liulin.springjiemi.ioc.applicationcontext;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-03 10:44:20
 **/
public class FooBar2 implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    public void foo(String location) {
        System.out.println(getResourceLoader().getResource(location).getClass());
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}

package cn.liulin.springjiemi.ioc.applicationcontext;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-03 10:41:37
 **/
public class FooBarTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("foo-config.xml");
        FooBar fooBar = (FooBar) applicationContext.getBean("fooBar");
        System.out.println(fooBar.getResourceLoader());
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("foo-config2.xml");
        FooBar2 fooBar2 = (FooBar2) applicationContext.getBean("fooBar2");
        System.out.println(fooBar2.getResourceLoader());
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("foo-config3.xml");
        FooBar3 fooBar3 = (FooBar3) applicationContext.getBean("fooBar3");
        System.out.println(fooBar3.getResourceLoader());
    }
}

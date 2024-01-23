package cn.liulin.springjiemi.ioc.beanfactory;

import cn.liulin.springjiemi.ioc.pojo.ioc.FXNewsProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cn.liulin.springjiemi.ioc.beanfactory$
 *
 * @author ll
 * @date 2023-12-28 16:05:01
 **/
public class BeanFactoryAnnoTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-scan.xml");
        FXNewsProvider newsProvider = (FXNewsProvider) ctx.getBean("FXNewsProvider");
        newsProvider.getAndPersistNews();
    }
}

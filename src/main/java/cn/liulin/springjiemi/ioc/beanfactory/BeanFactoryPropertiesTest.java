package cn.liulin.springjiemi.ioc.beanfactory;

import cn.liulin.springjiemi.ioc.pojo.ioc.FXNewsProvider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

/**
 * cn.liulin.springjiemi.ioc.beanfactory$
 * 已过时，配置文件
 * @author ll
 * @date 2023-12-28 15:27:39
 **/
public class BeanFactoryPropertiesTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaPropertiesFile(beanRegistry);
        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
        newsProvider.getAndPersistNews();
    }

    private static BeanFactory bindViaPropertiesFile(BeanDefinitionRegistry registry) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("classpath:binding-config.properties");
        return (BeanFactory)registry;
    }
}

package cn.liulin.springjiemi.ioc.beanfactory;

import cn.liulin.springjiemi.ioc.pojo.ioc.DowJonesNewsListener;
import cn.liulin.springjiemi.ioc.pojo.ioc.DowJonesNewsPersister;
import cn.liulin.springjiemi.ioc.pojo.ioc.FXNewsProvider;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * cn.liulin.springjiemi.ioc.beanfactory$
 *
 * @author ll
 * @date 2023-12-28 14:29:19
 **/
public class BeanFactoryCodeTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaCode(beanRegistry);
        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
        newsProvider.getAndPersistNews();
    }

    private static BeanFactory bindViaCode(BeanDefinitionRegistry registry) {
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(DowJonesNewsListener.class);
        AbstractBeanDefinition newsPersister = new RootBeanDefinition(DowJonesNewsPersister.class);
        registry.registerBeanDefinition("djNewsProvider", newsProvider);
        registry.registerBeanDefinition("djListener", newsListener);
        registry.registerBeanDefinition("djPersister", newsPersister);
        // 通过构造方法注入
//        ConstructorArgumentValues argValues = new ConstructorArgumentValues();
//        argValues.addIndexedArgumentValue(0, newsListener);
//        argValues.addIndexedArgumentValue(1, newsPersister);
//        newsProvider.setConstructorArgumentValues(argValues);
        // 通过setter方法注入
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("newsListener",newsListener));
        propertyValues.addPropertyValue(new PropertyValue("newPersistener",newsPersister));
        newsProvider.setPropertyValues(propertyValues);
        return (BeanFactory) registry;
    }
}

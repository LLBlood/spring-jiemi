package cn.liulin.springjiemi.ioc.beanfactory;

import cn.liulin.springjiemi.ioc.pojo.ioc.FXNewsProvider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * cn.liulin.springjiemi.ioc.beanfactory$
 *
 * @author ll
 * @date 2023-12-28 15:52:06
 **/
public class BeanFactoryXmlTest {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaXmlFile(beanRegistry);
        FXNewsProvider newsProvider = (FXNewsProvider)container.getBean("djNewsProvider");
        newsProvider.getAndPersistNews();
    }

    private static BeanFactory bindViaXmlFile(BeanDefinitionRegistry registry) {
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("classpath:news-config.xml");
        return (BeanFactory)registry;
        // 或者直接
        //return new XmlBeanFactory(new ClassPathResource("news-config.xml"));
    }
}

package cn.liulin.springjiemi.ioc.pojo.iocext;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * cn.liulin.springjiemi.ioc.pojo.iocext$
 *
 * @author ll
 * @date 2024-01-05 11:13:15
 **/
public class FxNewsTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("newsext-config.xml");
        cn.liulin.springjiemi.pojo.iocext.FXNewsProviderExt fXNewsProviderExt = (cn.liulin.springjiemi.pojo.iocext.FXNewsProviderExt) applicationContext.getBean("newsProviderExt");
        fXNewsProviderExt.getAndPersistNews();
    }
}

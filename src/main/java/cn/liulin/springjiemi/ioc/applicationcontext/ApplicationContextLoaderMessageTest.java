package cn.liulin.springjiemi.ioc.applicationcontext;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.context.support.StaticMessageSource;

import java.util.Locale;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-03 10:21:47
 **/
public class ApplicationContextLoaderMessageTest {
    @Test
    public void loadTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("message-config.xml");
        String fileMessage = applicationContext.getMessage("menu.file", new Object[]{"F"}, Locale.US);
        String editMessage = applicationContext.getMessage("menu.edit", null, Locale.SIMPLIFIED_CHINESE);
        Assert.assertEquals("File(F)", fileMessage);
        Assert.assertEquals("编辑", editMessage);
    }

    @Test
    public void messageTest() {
        StaticMessageSource messageSource = new StaticMessageSource();
        messageSource.addMessage("menu.file", Locale.US, "File");
        messageSource.addMessage("menu.edit", Locale.US, "Edit");
        Assert.assertEquals("File(F)", messageSource.getMessage("menu.file", new Object[]{"F"}, Locale.US));
        Assert.assertEquals("Edit", messageSource.getMessage("menu.edit", null,"Edit", Locale.US));
    }

    @Test
    public void messageTest2() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames(new String[]{"message"});// 从 classpath加载资源文件
        Assert.assertEquals("File(F)", messageSource.getMessage("menu.file", new Object[]{"F"}, Locale.US));
    }

    @Test
    public void messageTest3() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasenames(new String[]{"file:D:\\IdeaWorkSpace_Study\\spring-jiemi\\src\\main\\resources\\message"}); // 从文件系统加载资源文件
        Assert.assertEquals("File(F)", messageSource.getMessage("menu.file", new Object[]{"F"}, Locale.US));
    }
}

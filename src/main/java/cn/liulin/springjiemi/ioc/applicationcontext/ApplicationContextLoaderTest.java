package cn.liulin.springjiemi.ioc.applicationcontext;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-03 10:21:47
 **/
public class ApplicationContextLoaderTest {
    @Test
    public void loadTest() {
        ResourceLoader resourceLoader = new ClassPathXmlApplicationContext("news-config.xml");
        // 或者
        // ResourceLoader resourceLoader = new FileSystemXmlApplicationContext("配置文件路径");
        Resource fileResource = resourceLoader.getResource("D:/spring21site/README");
        Assert.assertTrue(fileResource instanceof ClassPathResource);
        Assert.assertFalse(fileResource.exists());
        Resource urlResource2 = resourceLoader.getResource("http://www.spring21.cn");
        Assert.assertTrue(urlResource2 instanceof UrlResource);
    }
}

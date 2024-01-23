package cn.liulin.springjiemi.ioc.applicationcontext;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.*;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-02 17:11:34
 **/
public class FileSystemResourceLoaderTest {
    @Test
    public void testResourceTypesWithFileSystemResourceLoader() {
        ResourceLoader resourceLoader = new FileSystemResourceLoader();
        Resource fileResource = resourceLoader.getResource("D:/spring21site/README");
        Assert.assertTrue(fileResource instanceof FileSystemResource);

        Resource urlResource = resourceLoader.getResource("file:D:/spring21site/README");
        Assert.assertTrue(urlResource instanceof UrlResource);
    }
}

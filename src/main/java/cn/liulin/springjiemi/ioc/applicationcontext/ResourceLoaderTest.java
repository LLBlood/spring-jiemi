package cn.liulin.springjiemi.ioc.applicationcontext;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * cn.liulin.springjiemi.ioc.applicationcontext$
 *
 * @author ll
 * @date 2024-01-02 16:38:21
 **/
public class ResourceLoaderTest {
    @Test
    public void testLoader() throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource fakeFileResource = resourceLoader.getResource("D:/spring21site/README");
        Assert.assertTrue(fakeFileResource instanceof ClassPathResource);
        Assert.assertFalse(fakeFileResource.exists());

        Resource urlResource1 = resourceLoader.getResource("file:D:/spring21site/README");
        Assert.assertTrue(urlResource1 instanceof UrlResource);

        Resource urlResource2 = resourceLoader.getResource("http://www.spring21.cn");
        Assert.assertTrue(urlResource2 instanceof UrlResource);

        try{
            fakeFileResource.getFile();
            System.out.println("no such file with path["+fakeFileResource.getFilename()+"] exists in classpath");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            urlResource1.getFile();
        } catch(FileNotFoundException e){
           e.printStackTrace();
        }
    }
}

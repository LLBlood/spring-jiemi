package cn.liulin.springjiemi.ioc.locale;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * cn.liulin.springjiemi.ioc.locale$
 *
 * @author ll
 * @date 2024-01-03 11:41:54
 **/
public class BundleTest {
    @Test
    public void test() {
        ResourceBundle message = ResourceBundle.getBundle("message", Locale.SIMPLIFIED_CHINESE);
        System.out.println(message.getString("menu.file"));
        ResourceBundle message2 = ResourceBundle.getBundle("message", Locale.US);
        System.out.println(message2.getString("menu.file"));
    }
}

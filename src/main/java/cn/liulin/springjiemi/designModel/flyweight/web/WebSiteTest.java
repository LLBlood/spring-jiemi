package cn.liulin.springjiemi.designModel.flyweight.web;

import org.junit.Test;

/**
 * cn.liulin.springjiemi.designModel.flyweight.web$
 *
 * @author ll
 * @date 2024-01-23 17:01:14
 **/
public class WebSiteTest {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite fx = webSiteFactory.getWebSite("产品展示");
        WebSite fy = webSiteFactory.getWebSite("产品展示");
        WebSite fz = webSiteFactory.getWebSite("产品展示");
        WebSite fl = webSiteFactory.getWebSite("博客");
        WebSite fm = webSiteFactory.getWebSite("博客");
        WebSite fn = webSiteFactory.getWebSite("博客");

        fx.use();
        fy.use();
        fz.use();
        fl.use();
        fm.use();
        fn.use();

        System.out.println("网站分类总数为：" + webSiteFactory.getWebSiteCount());

    }



    @Test
    public void test() {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite fx = webSiteFactory.getWebSite("产品展示");
        WebSite fy = webSiteFactory.getWebSite("产品展示");
        WebSite fz = webSiteFactory.getWebSite("产品展示");
        WebSite fl = webSiteFactory.getWebSite("博客");
        WebSite fm = webSiteFactory.getWebSite("博客");
        WebSite fn = webSiteFactory.getWebSite("博客");

        fx.use(new User("小菜"));
        fy.use(new User("小乔"));
        fz.use(new User("大桥"));
        fl.use(new User("教教"));
        fm.use(new User("六线"));
        fn.use(new User("深度"));

        System.out.println("网站分类总数为：" + webSiteFactory.getWebSiteCount());
    }
}

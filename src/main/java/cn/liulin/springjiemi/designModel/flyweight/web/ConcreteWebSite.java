package cn.liulin.springjiemi.designModel.flyweight.web;

/**
 * cn.liulin.springjiemi.designModel.flyweight.web$
 *
 * @author ll
 * @date 2024-01-23 16:58:30
 **/
public class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }


}

package cn.liulin.springjiemi.designModel.flyweight.web;

/**
 * cn.liulin.springjiemi.designModel.flyweight.web$
 *
 * @author ll
 * @date 2024-01-23 17:03:39
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

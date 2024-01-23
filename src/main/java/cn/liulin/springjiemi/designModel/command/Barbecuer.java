package cn.liulin.springjiemi.designModel.command;

/**
 * cn.liulin.springjiemi.designModel.command$
 *
 * @author ll
 * @date 2024-01-22 14:46:22
 **/
public class Barbecuer {
    private String name;

    public Barbecuer(String name) {
        this.name = name;
    }

    public void barbecue() {
        System.out.println(name + "开始烤肉");
    }

    public void chicken() {
        System.out.println(name + "开始烤鸡翅膀");
    }
}

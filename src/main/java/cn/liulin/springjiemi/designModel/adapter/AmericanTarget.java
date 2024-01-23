package cn.liulin.springjiemi.designModel.adapter;

/**
 * cn.liulin.springjiemi.designModel.adapter$
 *
 * @author ll
 * @date 2024-01-18 16:40:12
 **/
public class AmericanTarget implements Target {

    private String name;

    public AmericanTarget(String name) {
        this.name = name;
    }

    @Override
    public void attach() {
        System.out.println("美国人" + name + "进攻");
    }

    @Override
    public void defend() {
        System.out.println("美国人" + name + "防守");
    }
}

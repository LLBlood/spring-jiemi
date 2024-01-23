package cn.liulin.springjiemi.designModel.adapter;

/**
 * cn.liulin.springjiemi.designModel.adapter$
 *
 * @author ll
 * @date 2024-01-18 16:40:12
 **/
public class BritishPeopleTarget implements Target {

    private String name;

    public BritishPeopleTarget(String name) {
        this.name = name;
    }

    @Override
    public void attach() {
        System.out.println("英国人" + name + "进攻");
    }

    @Override
    public void defend() {
        System.out.println("英国人" + name + "防守");
    }
}

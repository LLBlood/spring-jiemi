package cn.liulin.springjiemi.designModel.composite;

/**
 * cn.liulin.springjiemi.designModel.composite$
 *
 * @author ll
 * @date 2024-01-19 09:36:37
 **/
public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
    public abstract void lineOfDuty();
}

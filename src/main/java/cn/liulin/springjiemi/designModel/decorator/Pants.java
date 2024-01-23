package cn.liulin.springjiemi.designModel.decorator;

/**
 * cn.liulin.springjiemi.designModel.decorator$
 *
 * @author ll
 * @date 2024-01-16 16:08:34
 **/
public class Pants extends Decorator {
    private String name;

    public Pants(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(this.name + " ");
        super.operation();
    }
}

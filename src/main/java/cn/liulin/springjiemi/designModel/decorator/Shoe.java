package cn.liulin.springjiemi.designModel.decorator;

/**
 * cn.liulin.springjiemi.designModel.decorator$
 *
 * @author ll
 * @date 2024-01-16 16:09:07
 **/
public class Shoe extends Decorator {
    private String name;

    public Shoe(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(this.name + " ");
        super.operation();
    }
}

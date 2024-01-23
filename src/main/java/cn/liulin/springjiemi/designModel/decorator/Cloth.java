package cn.liulin.springjiemi.designModel.decorator;

/**
 * cn.liulin.springjiemi.designModel.decorator$
 *
 * @author ll
 * @date 2024-01-16 16:07:13
 **/
public class Cloth extends Decorator {
    private String name;

    public Cloth(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(this.name + " ");
        super.operation();
    }
}

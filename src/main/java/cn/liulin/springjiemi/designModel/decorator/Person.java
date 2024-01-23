package cn.liulin.springjiemi.designModel.decorator;

/**
 * cn.liulin.springjiemi.designModel.decorator$
 *
 * @author ll
 * @date 2024-01-16 16:03:30
 **/
public class Person implements Component {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.print(this.name + " ");
    }
}

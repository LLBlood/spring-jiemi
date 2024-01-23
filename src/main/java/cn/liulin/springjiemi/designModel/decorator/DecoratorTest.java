package cn.liulin.springjiemi.designModel.decorator;

/**
 * cn.liulin.springjiemi.designModel.decorator$
 *
 * @author ll
 * @date 2024-01-16 16:09:38
 **/
public class DecoratorTest {
    public static void main(String[] args) {
        Person person = new Person("小红");
        Cloth cloth = new Cloth("T衬衫");
        Pants pants = new Pants("小花裙");
        Shoe shoe = new Shoe("高跟鞋");
        pants.setComponent(shoe);
        shoe.setComponent(cloth);
        cloth.setComponent(person);
        pants.operation();
    }
}

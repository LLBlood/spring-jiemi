package cn.liulin.springjiemi.designModel.builder;

/**
 * cn.liulin.springjiemi.designModel.builder$
 *
 * @author ll
 * @date 2024-01-17 15:24:34
 **/
public class BuildTest {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
        director.construct(concreteBuilderA);
        Product result = concreteBuilderA.getResult();
        result.show();

        ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();
        director.construct(concreteBuilderB);
        Product result1 = concreteBuilderB.getResult();
        result1.show();
    }
}

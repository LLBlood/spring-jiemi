package cn.liulin.springjiemi.designModel.mediator;

/**
 * cn.liulin.springjiemi.designModel.mediator$
 *
 * @author ll
 * @date 2024-01-22 17:30:35
 **/
public class MediatorTest {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteCountry1 concreteCountry1 = new ConcreteCountry1(concreteMediator);
        ConcreteCountry2 concreteCountry2 = new ConcreteCountry2(concreteMediator);
        concreteMediator.setConcreteCountry1(concreteCountry1);
        concreteMediator.setConcreteCountry2(concreteCountry2);
        concreteCountry1.send("你吃过了没");
        concreteCountry2.send("吃过了，你呢");
    }
}

package cn.liulin.springjiemi.designModel.iterator;

/**
 * cn.liulin.springjiemi.designModel.iterator$
 *
 * @author ll
 * @date 2024-01-22 13:23:04
 **/
public class IteratorTest {
    public static void main(String[] args) {
        ConcreteMyAggregate concreteMyAggregate = new ConcreteMyAggregate();
        concreteMyAggregate.setValue("11");
        concreteMyAggregate.setValue("22");
        concreteMyAggregate.setValue("33");
        concreteMyAggregate.setValue("44");
        MyIterator myIterator = concreteMyAggregate.createMyIterator();
        System.out.println(myIterator.first());
        while (!myIterator.isDone()) {
            Object next = myIterator.next();
            System.out.println(next);
        }
        System.out.println(myIterator.current());
    }
}

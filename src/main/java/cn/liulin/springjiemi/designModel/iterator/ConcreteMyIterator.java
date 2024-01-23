package cn.liulin.springjiemi.designModel.iterator;

/**
 * cn.liulin.springjiemi.designModel.iterator$
 *
 * @author ll
 * @date 2024-01-19 10:26:44
 **/
public class ConcreteMyIterator implements MyIterator {

    private ConcreteMyAggregate concreteMyAggregate;
    private int count = 0;

    public ConcreteMyIterator(ConcreteMyAggregate concreteMyAggregate) {
        this.concreteMyAggregate = concreteMyAggregate;
    }

    @Override
    public Object first() {
        return this.concreteMyAggregate.getIndex(0);
    }

    @Override
    public Object next() {
        if (count - 1 < this.concreteMyAggregate.getSize()) {
            count++;
            return this.concreteMyAggregate.getIndex(count);
        }
        throw new RuntimeException("已超出索引限制");
    }

    @Override
    public boolean isDone() {
        return count >= this.concreteMyAggregate.getSize() - 1;
    }

    @Override
    public Object current() {
        if (count < this.concreteMyAggregate.getSize()) {
            return this.concreteMyAggregate.getIndex(count);
        }
        throw new RuntimeException("已超出索引限制");
    }
}

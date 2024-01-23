package cn.liulin.springjiemi.designModel.iterator;

import java.util.LinkedList;
import java.util.List;

/**
 * cn.liulin.springjiemi.designModel.iterator$
 *
 * @author ll
 * @date 2024-01-19 10:25:32
 **/
public class ConcreteMyAggregate implements MyAggregate {

    private List<Object> list = new LinkedList<>();

    @Override
    public MyIterator createMyIterator() {
        return new ConcreteMyIterator(this);
    }

    public Object getIndex(int index) {
        return list.get(index);
    }

    public void setValue(Object value) {
        list.add(value);
    }

    public int getSize() {
        return list.size();
    }
}

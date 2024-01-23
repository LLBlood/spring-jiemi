package cn.liulin.springjiemi.designModel.iterator;

/**
 * cn.liulin.springjiemi.designModel.iterator$
 *
 * @author ll
 * @date 2024-01-19 10:15:22
 **/
public interface MyIterator {
    Object first();
    Object next();
    boolean isDone();
    Object current();
}

package cn.liulin.springjiemi.designModel.flyweight.common;

/**
 * cn.liulin.springjiemi.designModel.flyweight.common$
 *
 * @author ll
 * @date 2024-01-23 09:52:46
 **/
public class ConcreteFlyWeight extends FlyWeight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight:" + extrinsicstate);
    }
}

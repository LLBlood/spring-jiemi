package cn.liulin.springjiemi.designModel.flyweight.common;

/**
 * cn.liulin.springjiemi.designModel.flyweight.common$
 *
 * @author ll
 * @date 2024-01-23 09:54:02
 **/
public class UnShareConcreteFlyWeight extends FlyWeight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight:" + extrinsicstate);
    }
}

package cn.liulin.springjiemi.designModel.flyweight.common;

import org.junit.Test;

/**
 * cn.liulin.springjiemi.designModel.flyweight.common$
 *
 * @author ll
 * @date 2024-01-23 09:56:02
 **/
public class CommonTest {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        int extrinsicstate = 22;
        FlyWeight fx = flyWeightFactory.getFlyWeight("x");
        FlyWeight fy = flyWeightFactory.getFlyWeight("y");
        FlyWeight fz = flyWeightFactory.getFlyWeight("z");

        fx.operation(--extrinsicstate);
        fy.operation(--extrinsicstate);
        fz.operation(--extrinsicstate);

        FlyWeight uf = new UnShareConcreteFlyWeight();
        uf.operation(--extrinsicstate);
    }
}

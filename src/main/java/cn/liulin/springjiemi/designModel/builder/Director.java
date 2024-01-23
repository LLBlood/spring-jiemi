package cn.liulin.springjiemi.designModel.builder;

/**
 * cn.liulin.springjiemi.designModel.builder$
 *
 * @author ll
 * @date 2024-01-17 15:22:21
 **/
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}

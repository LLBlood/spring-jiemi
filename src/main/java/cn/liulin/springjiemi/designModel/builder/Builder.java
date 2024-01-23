package cn.liulin.springjiemi.designModel.builder;

/**
 * cn.liulin.springjiemi.designModel.builder$
 *
 * @author ll
 * @date 2024-01-17 15:21:02
 **/
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}

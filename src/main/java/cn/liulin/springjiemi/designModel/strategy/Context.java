package cn.liulin.springjiemi.designModel.strategy;

/**
 * cn.liulin.springjiemi.designModel.strategy$
 *
 * @author ll
 * @date 2024-01-16 14:58:50
 **/
public class Context {
    private GoStrategy goStrategy;
    public Context(GoStrategy goStrategy) {
        this.goStrategy = goStrategy;
    }

    public void goContext() {
        goStrategy.goType();
    }
}

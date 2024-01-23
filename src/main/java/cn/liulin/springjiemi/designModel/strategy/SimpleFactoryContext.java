package cn.liulin.springjiemi.designModel.strategy;

/**
 * cn.liulin.springjiemi.designModel.strategy$
 *
 * @author ll
 * @date 2024-01-16 15:00:06
 **/
public class SimpleFactoryContext {
    private GoStrategy goStrategy;
    public SimpleFactoryContext(int type) {
        switch (type) {
            case 0:
                goStrategy = new BicycleStrategy();
                break;
            case 1 :
                goStrategy = new HighSpeedRailStrategy();
                break;
            default:
                goStrategy = new RunStrategy();
                break;
        }
    }

    public void goContext() {
        goStrategy.goType();
    }
}

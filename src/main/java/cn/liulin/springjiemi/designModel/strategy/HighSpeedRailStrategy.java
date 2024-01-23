package cn.liulin.springjiemi.designModel.strategy;

/**
 * cn.liulin.springjiemi.designModel.strategy$
 *
 * @author ll
 * @date 2024-01-16 14:58:25
 **/
public class HighSpeedRailStrategy implements GoStrategy {
    @Override
    public void goType() {
        System.out.println("用高铁出发");
    }
}

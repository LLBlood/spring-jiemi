package cn.liulin.springjiemi.designModel.strategy;

/**
 * cn.liulin.springjiemi.designModel.strategy$
 *
 * @author ll
 * @date 2024-01-16 14:57:17
 **/
public class BicycleStrategy implements GoStrategy {
    @Override
    public void goType() {
        System.out.println("骑自行车出发");
    }
}

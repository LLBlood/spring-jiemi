package cn.liulin.springjiemi.designModel.strategy;

/**
 * cn.liulin.springjiemi.designModel.strategy$
 *
 * @author ll
 * @date 2024-01-16 14:56:26
 **/
public class RunStrategy implements GoStrategy {
    @Override
    public void goType() {
        System.out.println("用腿出发走路");
    }
}

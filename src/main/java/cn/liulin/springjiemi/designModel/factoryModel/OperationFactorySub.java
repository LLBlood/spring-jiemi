package cn.liulin.springjiemi.designModel.factoryModel;

/**
 * cn.liulin.springjiemi.designModel.factoryModel$
 *
 * @author ll
 * @date 2024-01-17 13:52:53
 **/
public class OperationFactorySub extends OperationFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}

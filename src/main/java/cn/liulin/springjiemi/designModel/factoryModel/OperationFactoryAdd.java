package cn.liulin.springjiemi.designModel.factoryModel;

/**
 * cn.liulin.springjiemi.designModel.factoryModel$
 *
 * @author ll
 * @date 2024-01-17 13:52:12
 **/
public class OperationFactoryAdd extends OperationFactory{
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}

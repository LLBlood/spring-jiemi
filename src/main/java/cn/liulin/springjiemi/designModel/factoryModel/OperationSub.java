package cn.liulin.springjiemi.designModel.factoryModel;

/**
 * cn.liulin.springjiemi.designModel.factoryModel$
 *
 * @author ll
 * @date 2024-01-17 13:52:35
 **/
public class OperationSub extends Operation {
    @Override
    public int getResult() {
        return numberA - numberB;
    }
}

package cn.liulin.springjiemi.designModel.factoryModel;

/**
 * cn.liulin.springjiemi.designModel.factoryModel$
 *
 * @author ll
 * @date 2024-01-17 13:51:51
 **/
public class OperationAdd extends Operation {
    @Override
    public int getResult() {
        return numberA + numberB;
    }
}

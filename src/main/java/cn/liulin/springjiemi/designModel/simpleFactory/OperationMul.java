package cn.liulin.springjiemi.designModel.simpleFactory;

/**
 * cn.liulin.springjiemi.designModel.simpleFactory$
 *
 * @author ll
 * @date 2024-01-16 14:13:59
 **/
public class OperationMul extends Operation {
    @Override
    public int getResult() {
        return numberA * numberB;
    }
}

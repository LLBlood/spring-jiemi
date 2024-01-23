package cn.liulin.springjiemi.designModel.factoryModel;

/**
 * cn.liulin.springjiemi.designModel.factoryModel$
 *
 * @author ll
 * @date 2024-01-17 13:53:12
 **/
public class OperationTest {
    public static void main(String[] args) {
        OperationFactory operationFactory = new OperationFactorySub();
        Operation operation = operationFactory.createOperation();
        operation.numberA = 5;
        operation.numberB = 4;
        int result = operation.getResult();
        System.out.println(result);
    }
}

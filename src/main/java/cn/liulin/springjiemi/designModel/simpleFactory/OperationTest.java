package cn.liulin.springjiemi.designModel.simpleFactory;

import java.util.Objects;

/**
 * cn.liulin.springjiemi.designModel.simpleFactory$
 *
 * @author ll
 * @date 2024-01-16 14:18:41
 **/
public class OperationTest {
    public static void main(String[] args) {
        Operation operation = OperationFactory.getOperation("1");
        Objects.requireNonNull(operation, "运算工厂不能为空");
        operation.numberA = 10;
        operation.numberB = 9;
        System.out.println(operation.getResult());
    }
}

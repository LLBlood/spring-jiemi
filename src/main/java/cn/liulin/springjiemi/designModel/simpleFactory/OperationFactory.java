package cn.liulin.springjiemi.designModel.simpleFactory;

/**
 * cn.liulin.springjiemi.designModel.simpleFactory$
 *
 * @author ll
 * @date 2024-01-16 14:16:50
 **/
public class OperationFactory {
    public static Operation getOperation(String operation) {
        switch (operation) {
            case "-" :
                return new OperationSub();
            case "+" :
                return new OperationAdd();
            case "/" :
                return new OperationDiv();
            case "*" :
                return new OperationMul();
            default:
                return null;
        }
    }
}

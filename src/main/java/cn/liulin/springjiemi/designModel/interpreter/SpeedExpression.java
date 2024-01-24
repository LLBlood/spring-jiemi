package cn.liulin.springjiemi.designModel.interpreter;

/**
 * cn.liulin.springjiemi.designModel.interpreter$
 *
 * @author ll
 * @date 2024-01-24 10:18:39
 **/
public class SpeedExpression extends Expression {
    @Override
    protected void execute(String playKey, String playValue) {
        switch (playValue) {
            case "1000":
                System.out.print("每节拍一秒 ");
                break;
            case "500":
                System.out.print("每节拍半秒 ");
                break;
            default:
                break;
        }
    }
}

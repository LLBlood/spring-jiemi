package cn.liulin.springjiemi.designModel.interpreter;

/**
 * cn.liulin.springjiemi.designModel.interpreter$
 *
 * @author ll
 * @date 2024-01-24 10:04:29
 **/
public class ScaleExpression extends Expression {
    @Override
    protected void execute(String playKey, String playValue) {
        switch (playValue) {
            case "1":
                System.out.print("低音阶 ");
                break;
            case "2":
                System.out.print("中音阶 ");
                break;
            case "3":
                System.out.print("高音阶 ");
                break;
            default:
                break;
        }
    }
}

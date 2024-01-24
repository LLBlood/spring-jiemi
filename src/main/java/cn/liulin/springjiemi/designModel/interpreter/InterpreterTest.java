package cn.liulin.springjiemi.designModel.interpreter;

/**
 * cn.liulin.springjiemi.designModel.interpreter$
 *
 * @author ll
 * @date 2024-01-24 10:11:00
 **/
public class InterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setText("T 1000 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        while (context.getText().length() > 0) {
            String key = context.getText().substring(0, 1);
            switch (key) {
                case "O":
                    expression = new ScaleExpression();
                    break;
                case "T":
                    expression = new SpeedExpression();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new NoteExpression();
                    break;
                default:
                    break;
            }
            if (expression == null) {
                System.out.println("解析异常");
                break;
            }
            expression.interpreter(context);
        }
    }
}

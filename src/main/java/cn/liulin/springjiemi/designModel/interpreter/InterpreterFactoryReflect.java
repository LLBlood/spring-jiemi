package cn.liulin.springjiemi.designModel.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * cn.liulin.springjiemi.designModel.interpreter$
 *
 * @author ll
 * @date 2024-01-24 10:11:00
 **/
public class InterpreterFactoryReflect {

    private static Map<String, String> classNameMap = new HashMap();

    private static String defaultStr = "cn.liulin.springjiemi.designModel.interpreter.NoteExpression";

    static {
        classNameMap.put("O", "cn.liulin.springjiemi.designModel.interpreter.ScaleExpression");
        classNameMap.put("T", "cn.liulin.springjiemi.designModel.interpreter.SpeedExpression");
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setText("T 1000 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        while (context.getText().length() > 0) {
            String key = context.getText().substring(0, 1);
            String className = classNameMap.getOrDefault(key, defaultStr);
            try {
                expression = (Expression) Class.forName(className).newInstance();
            } catch (Exception e) {
                System.out.println("解析异常");
                break;
            }
            expression.interpreter(context);
        }
    }
}

package cn.liulin.springjiemi.designModel.interpreter;

/**
 * cn.liulin.springjiemi.designModel.interpreter$
 *
 * @author ll
 * @date 2024-01-24 09:56:57
 **/
public abstract class Expression {
    public void interpreter(Context context) {
        if (context.getText().length() == 0) {
            return;
        }
        String playKey = context.getText().substring(0, 1);
        context.setText(context.getText().substring(2));
        String playValue = context.getText().substring(0, context.getText().indexOf(" "));
        context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
        execute(playKey, playValue);
    }

    protected abstract void execute(String playKey, String playValue);
}

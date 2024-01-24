package cn.liulin.springjiemi.designModel.interpreter;

/**
 * cn.liulin.springjiemi.designModel.interpreter$
 *
 * @author ll
 * @date 2024-01-24 10:02:06
 **/
public class NoteExpression extends Expression {
    @Override
    protected void execute(String playKey, String playValue) {
        switch (playKey) {
            case "C":
                System.out.print("Do ");
                System.out.print(getPlayValue(playValue));
                break;
            case "D":
                System.out.print("Re ");
                System.out.print(getPlayValue(playValue));
                break;
            case "E":
                System.out.print("Mi ");
                System.out.print(getPlayValue(playValue));
                break;
            case "F":
                System.out.print("Fa ");
                System.out.print(getPlayValue(playValue));
                break;
            case "G":
                System.out.print("So ");
                System.out.print(getPlayValue(playValue));
                break;
            case "A":
                System.out.print("La ");
                System.out.print(getPlayValue(playValue));
                break;
            case "B":
                System.out.print("Ti ");
                System.out.print(getPlayValue(playValue));
                break;
            default:
                break;
        }
    }

    private String getPlayValue(String playValue) {
        String value = "";
        switch (playValue) {
            case "1":
                value = "一拍 ";
                break;
            case "2":
                value = "二拍 ";
                break;
            case "3":
                value = "三拍 ";
                break;
            case "0.5":
                value = "半拍 ";
                break;
            case "0.25":
                value = "四分之一拍 ";
                break;
            default:
                break;
        }
        return value;
    }
}

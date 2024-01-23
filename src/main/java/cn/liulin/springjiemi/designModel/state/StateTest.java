package cn.liulin.springjiemi.designModel.state;

/**
 * cn.liulin.springjiemi.designModel.state$
 *
 * @author ll
 * @date 2024-01-18 14:09:12
 **/
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setHour(6);
        context.work();

        context.setHour(11);
        context.work();

        context.setHour(13);
        context.work();

        context.setHour(19);
        context.work();

        context.setFinish(true);
        context.setHour(23);
        context.work();
    }
}

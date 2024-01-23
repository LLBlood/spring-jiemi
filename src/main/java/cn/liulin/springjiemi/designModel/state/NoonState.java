package cn.liulin.springjiemi.designModel.state;

/**
 * cn.liulin.springjiemi.designModel.state$
 *
 * @author ll
 * @date 2024-01-18 14:06:03
 **/
public class NoonState implements State {
    @Override
    public void handle(Context context) {
        if (context.getHour() < 16) {
            System.out.println("中午工作想睡觉");
        } else {
            context.setState(new NightState());
            context.work();
        }
    }
}

package cn.liulin.springjiemi.designModel.state;

/**
 * cn.liulin.springjiemi.designModel.state$
 *
 * @author ll
 * @date 2024-01-18 14:04:09
 **/
public class MorningState implements State {
    @Override
    public void handle(Context context) {
        if (context.getHour() < 12) {
            System.out.println("早上工作精神好");
        } else {
            context.setState(new NoonState());
            context.work();
        }
    }
}

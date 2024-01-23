package cn.liulin.springjiemi.designModel.state;

/**
 * cn.liulin.springjiemi.designModel.state$
 *
 * @author ll
 * @date 2024-01-18 14:06:51
 **/
public class NightState implements State {
    @Override
    public void handle(Context context) {
        if (context.getHour() < 21) {
            System.out.println("晚上工作想跑路");
        } else {
           if (context.getFinish()) {
               System.out.println("终于下班了");
           } else {
               System.out.println("顶不住就地而眠");
           }
        }
    }
}

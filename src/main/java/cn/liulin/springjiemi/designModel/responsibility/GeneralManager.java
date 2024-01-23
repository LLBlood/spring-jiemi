package cn.liulin.springjiemi.designModel.responsibility;

/**
 * cn.liulin.springjiemi.designModel.responsibility$
 *
 * @author ll
 * @date 2024-01-22 15:18:45
 **/
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getRequestType().equals("askForLeave")) {
            System.out.println(getName() + "批准请假:" + request.getRequestName());
        } else {
            getSuperManager().handlerRequest(request);
        }
    }
}

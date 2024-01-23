package cn.liulin.springjiemi.designModel.responsibility;

/**
 * cn.liulin.springjiemi.designModel.responsibility$
 *
 * @author ll
 * @date 2024-01-22 15:16:01
 **/
public class DirectorManager extends Manager {
    public DirectorManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if (request.getRequestType().equals("askForLeave") && request.getRequestNum() < 3) {
            System.out.println(getName() + "批准请假:" + request.getRequestName());
        } else {
            getSuperManager().handlerRequest(request);
        }
    }
}

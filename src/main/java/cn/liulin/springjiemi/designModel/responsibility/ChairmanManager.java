package cn.liulin.springjiemi.designModel.responsibility;

/**
 * cn.liulin.springjiemi.designModel.responsibility$
 *
 * @author ll
 * @date 2024-01-22 15:19:30
 **/
public class ChairmanManager extends Manager {
    public ChairmanManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        System.out.println(getName() + "批准:" + request.getRequestName());
    }
}

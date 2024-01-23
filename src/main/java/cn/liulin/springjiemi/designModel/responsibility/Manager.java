package cn.liulin.springjiemi.designModel.responsibility;

/**
 * cn.liulin.springjiemi.designModel.responsibility$
 *
 * @author ll
 * @date 2024-01-22 15:12:02
 **/
public abstract class Manager {
    private Manager superManager;
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.superManager = manager;
    }

    public abstract void handlerRequest(Request request);

    public String getName() {
        return name;
    }

    public Manager getSuperManager() {
        return superManager;
    }
}

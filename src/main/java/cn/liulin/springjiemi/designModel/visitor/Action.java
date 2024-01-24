package cn.liulin.springjiemi.designModel.visitor;

/**
 * cn.liulin.springjiemi.designModel.visitor$
 *
 * @author ll
 * @date 2024-01-24 11:06:31
 **/
public abstract class Action {
    private String type;

    public Action(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void getManConclusion(Man man);
    public abstract void getWomanConclusion(Woman woman);
}

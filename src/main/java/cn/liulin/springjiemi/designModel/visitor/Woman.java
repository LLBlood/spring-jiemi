package cn.liulin.springjiemi.designModel.visitor;

/**
 * cn.liulin.springjiemi.designModel.visitor$
 *
 * @author ll
 * @date 2024-01-24 11:07:10
 **/
public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getWomanConclusion(this);
    }
}

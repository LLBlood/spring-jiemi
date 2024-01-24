package cn.liulin.springjiemi.designModel.visitor;

/**
 * cn.liulin.springjiemi.designModel.visitor$
 *
 * @author ll
 * @date 2024-01-24 11:08:34
 **/
public class FailingAction extends Action {
    public FailingAction(String type) {
        super(type);
    }

    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getName() + getType() + "时，闷头喝酒，谁也不用劝");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getName() + getType() + "时，眼泪汪汪，谁也劝不了");
    }
}

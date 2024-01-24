package cn.liulin.springjiemi.designModel.visitor;

/**
 * cn.liulin.springjiemi.designModel.visitor$
 *
 * @author ll
 * @date 2024-01-24 11:08:34
 **/
public class SuccessAction extends Action {
    public SuccessAction(String type) {
        super(type);
    }

    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getName() + getType() + "时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getName() + getType() + "时，背后大多有一个不成功的男人");
    }
}

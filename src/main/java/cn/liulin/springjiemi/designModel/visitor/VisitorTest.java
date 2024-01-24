package cn.liulin.springjiemi.designModel.visitor;

/**
 * cn.liulin.springjiemi.designModel.visitor$
 *
 * @author ll
 * @date 2024-01-24 11:12:56
 **/
public class VisitorTest {
    public static void main(String[] args) {
        Man man = new Man("男人");
        Woman woman = new Woman("女人");
        FailingAction failingAction = new FailingAction("失败");
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(man);
        objectStructure.attach(woman);
        objectStructure.display(failingAction);
    }
}

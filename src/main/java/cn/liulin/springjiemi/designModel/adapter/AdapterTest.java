package cn.liulin.springjiemi.designModel.adapter;

/**
 * cn.liulin.springjiemi.designModel.adapter$
 *
 * @author ll
 * @date 2024-01-18 16:43:37
 **/
public class AdapterTest {
    public static void main(String[] args) {
        Target target1 = new BritishPeopleTarget("贝壳");
        Target target2 = new AmericanTarget("乔丹");
        Target target3 = new TranslatorTarget("张三丰");
        target1.attach();
        target2.attach();
        target3.attach();
        target1.defend();
        target2.defend();
        target3.defend();
    }
}

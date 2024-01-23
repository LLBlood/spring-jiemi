package cn.liulin.springjiemi.designModel.adapter;

/**
 * cn.liulin.springjiemi.designModel.adapter$
 *
 * @author ll
 * @date 2024-01-18 16:40:12
 **/
public class TranslatorTarget implements Target {

    private ChineseKongFu chineseKongFu;

    public TranslatorTarget(String name) {
        chineseKongFu = new ChineseKongFu(name);
    }

    @Override
    public void attach() {
        System.out.println("翻译员翻译");
        chineseKongFu.进攻();
    }

    @Override
    public void defend() {
        System.out.println("翻译员翻译");
        chineseKongFu.防守();
    }
}

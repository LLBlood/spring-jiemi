package cn.liulin.springjiemi.designModel.adapter;

/**
 * cn.liulin.springjiemi.designModel.adapter$
 *
 * @author ll
 * @date 2024-01-18 16:41:43
 **/
public class ChineseKongFu {
    private String name;

    public ChineseKongFu(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("中国人" + name + "进攻");
    }

    public void 防守() {
        System.out.println("中国人" + name + "防守");
    }
}

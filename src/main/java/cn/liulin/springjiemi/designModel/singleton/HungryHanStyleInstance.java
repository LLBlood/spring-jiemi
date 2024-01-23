package cn.liulin.springjiemi.designModel.singleton;

/**
 * cn.liulin.springjiemi.designModel.singleton$
 *
 * @author ll
 * @date 2024-01-22 13:40:27
 **/
public class HungryHanStyleInstance {
    private static volatile HungryHanStyleInstance hanStyleInstance = new HungryHanStyleInstance();
    private HungryHanStyleInstance() {}
    public static HungryHanStyleInstance getInstance() {
        return hanStyleInstance;
    }
    public void test() {

    }
}

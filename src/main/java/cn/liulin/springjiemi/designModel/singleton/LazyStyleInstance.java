package cn.liulin.springjiemi.designModel.singleton;

/**
 * cn.liulin.springjiemi.designModel.singleton$
 *
 * @author ll
 * @date 2024-01-22 13:36:02
 **/
public class LazyStyleInstance {
    private static LazyStyleInstance lazyStyleInstance;
    private LazyStyleInstance() {}
    public static LazyStyleInstance getInstance() {
        if (lazyStyleInstance == null) {
            synchronized (LazyStyleInstance.class) {
                if (lazyStyleInstance == null) {
                    lazyStyleInstance = new LazyStyleInstance();
                }
            }
        }
        return lazyStyleInstance;
    }
    public void test() {

    }
}

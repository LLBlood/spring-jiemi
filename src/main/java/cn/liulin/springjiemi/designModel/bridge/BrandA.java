package cn.liulin.springjiemi.designModel.bridge;

/**
 * cn.liulin.springjiemi.designModel.bridge$
 *
 * @author ll
 * @date 2024-01-22 14:23:34
 **/
public class BrandA extends Brand {
    public BrandA(String name) {
        super(name);
    }

    @Override
    public void operate() {
        System.out.println("品牌A调用开始");
        super.operate();
    }
}

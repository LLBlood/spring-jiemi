package cn.liulin.springjiemi.designModel.bridge;

/**
 * cn.liulin.springjiemi.designModel.bridge$
 *
 * @author ll
 * @date 2024-01-22 14:25:37
 **/
public class BridgeTest {
    public static void main(String[] args) {
        Brand brandA = new BrandA("品牌A");
        Brand brandB = new BrandB("品牌B");
        brandA.setSoftware(new SoftwareA());
        brandB.setSoftware(new SoftwareB());
        brandA.operate();
        brandB.operate();
    }
}

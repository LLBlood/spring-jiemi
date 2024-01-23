package cn.liulin.springjiemi.designModel.bridge;

/**
 * cn.liulin.springjiemi.designModel.bridge$
 *
 * @author ll
 * @date 2024-01-22 14:21:35
 **/
public abstract class Brand {
    private Software software;

    private String name;

    public Brand(String name) {
        this.name = name;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public void operate() {
        this.software.operate();
    }
}

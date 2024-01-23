package cn.liulin.springjiemi.designModel.prototype.shallowCopy;

/**
 * cn.liulin.springjiemi.designModel.prototype.shallowCopy$
 *
 * @author ll
 * @date 2024-01-17 14:08:24
 **/
public class Person implements Cloneable {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

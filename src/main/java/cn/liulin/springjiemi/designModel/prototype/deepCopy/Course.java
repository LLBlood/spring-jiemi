package cn.liulin.springjiemi.designModel.prototype.deepCopy;

/**
 * cn.liulin.springjiemi.designModel.prototype.deepCopy$
 *
 * @author ll
 * @date 2024-01-17 14:12:21
 **/
public class Course implements Cloneable {
    private String teacherName;
    private String name;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

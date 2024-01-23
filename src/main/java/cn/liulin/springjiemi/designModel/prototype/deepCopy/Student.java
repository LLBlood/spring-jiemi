package cn.liulin.springjiemi.designModel.prototype.deepCopy;

import org.junit.internal.Classes;

/**
 * cn.liulin.springjiemi.designModel.prototype.deepCopy$
 *
 * @author ll
 * @date 2024-01-17 14:11:22
 **/
public class Student implements Cloneable {
    private String name;
    private String sex;
    private Course course;

    public Student() {
    }

    public Student(Course course) throws CloneNotSupportedException {
        this.course = (Course) course.clone();
    }

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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = new Student(this.course);
        student.name = this.name;
        student.sex = this.sex;
        return student;
//        return super.clone();
    }
}

package cn.liulin.springjiemi.designModel.prototype.deepCopy;

import com.alibaba.fastjson.JSON;

/**
 * cn.liulin.springjiemi.designModel.prototype.deepCopy$
 *
 * @author ll
 * @date 2024-01-17 14:23:33
 **/
public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");
        student.setSex("男");
        Course course = new Course();
        course.setName("语文");
        course.setTeacherName("十大");
        student.setCourse(course);
        System.out.println(JSON.toJSONString(student));
        Student student1 = (Student) student.clone();
        student1.getCourse().setName("数学");
        student1.getCourse().setTeacherName("交易");
        student1.setName("里斯");
        System.out.println(JSON.toJSONString(student));
        System.out.println(JSON.toJSONString(student1));
    }
}

package cn.liulin.springjiemi.reflect;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * cn.liulin.springjiemi.reflect$
 *
 * @author ll
 * @date 2024-01-15 17:39:40
 **/
public class ReflectTest2 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        Field[] fields = studentClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("============================================");

        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        System.out.println("============================================");

        Field[] declaredFields1 = studentClass.getSuperclass().getDeclaredFields();
        for (Field field : declaredFields1) {
            System.out.println(field.getName());
        }

    }

    @Test
    public void test() throws Exception {
        A a = new A();
        a.as = "12121";
        Class<? extends A> aClass = a.getClass();
        Field as = aClass.getDeclaredField("as");
        System.out.println(as.get(a));
        Field sad = aClass.getDeclaredField("sad");
        sad.setAccessible(true);
        sad.set(a, 77);
        System.out.println(sad.get(a));
    }
}

class Student extends Person {
    public int score;
    private String tree;
}

class Person extends A {
    public String name;
    private int sex;
}

class A {
    private int sad;
    public String as;
}

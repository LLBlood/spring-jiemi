package cn.liulin.springjiemi.anno;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * cn.liulin.springjiemi.anno$
 *
 * @author ll
 * @date 2024-01-16 13:41:05
 **/
public class PersonTest {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        MyAnnotation annotation = personClass.getAnnotation(MyAnnotation.class);
        System.out.println(annotation.msg());

        Field field = personClass.getDeclaredField("weight");
        MyAnnotation annotation1 = field.getAnnotation(MyAnnotation.class);
        System.out.println(annotation1.msg());

        Field height = personClass.getDeclaredField("height");
        MyAnnotation annotation2 = height.getAnnotation(MyAnnotation.class);
        System.out.println(annotation2.msg());

        Method dance = personClass.getDeclaredMethod("dance");
        MyAnnotation annotation3 = dance.getAnnotation(MyAnnotation.class);
        System.out.println(annotation3.msg());
    }
}

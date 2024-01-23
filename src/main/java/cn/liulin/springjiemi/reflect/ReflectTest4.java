package cn.liulin.springjiemi.reflect;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * cn.liulin.springjiemi.reflect$
 *
 * @author ll
 * @date 2024-01-16 11:19:01
 **/
public class ReflectTest4 {
    public static void main(String[] args) throws Exception {
        Class<Student13> student13Class = Student13.class;
        System.out.println(student13Class.getMethod("getScore", String.class));
        System.out.println(student13Class.getMethod("getName"));
        Method[] methods = student13Class.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Method[] declaredMethods = student13Class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    @Test
    public void test() throws Exception {
        String s = "hello world";
        Method method = String.class.getMethod("substring", int.class);
        String r = (String) method.invoke(s,6);
        System.out.println(r);
        Method method2 = String.class.getMethod("substring", int.class, int.class);
        String r2 = (String) method2.invoke(s,6, 8);
        System.out.println(r2);
    }

    @Test
    public void test2() throws Exception {
        Method parseInt = Integer.class.getMethod("parseInt", String.class);
        int i = (int) parseInt.invoke(null, "123456");
        System.out.println(i);
    }

    @Test
    public void test3() throws Exception {
        Method getName = Person13.class.getMethod("getName");
        String ster = (String) getName.invoke(new Student13());
        System.out.println(ster);
    }
}
class Student13 extends Person13 {
    public int getScore(String type) {
        return 99;
    }
    private int getGrade(int year) {
        return 1;
    }
    @Override
    public String getName() {
        return "Student13";
    }
}
class Person13 {
    public String getName() {
        return "Person";
    }
}